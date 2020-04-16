package materialui.styles

import kotlinext.js.js
import kotlinx.css.CSSBuilder
import kotlinx.css.Overflow
import kotlinx.css.RuleSet
import kotlinx.css.hyphenize
import materialui.styles.muitheme.MuiTheme
import react.RProps

interface StylesSet {
    val theme: MuiTheme
    val css: MutableMap<String, CSSBuilder>

    operator fun String.invoke(block: RuleSet): String {
        css[this] = CSSBuilder().apply(block)
        return this
    }
}

internal class StylesBuilder(
    override val theme: MuiTheme,
    override val css: MutableMap<String, CSSBuilder> = mutableMapOf()
) : StylesSet {
    fun toDynamic() = js {
        css.forEach { (key, value) -> this[key] = value.toDynamic }
    } as Any
}

interface CreateStylesSet<P: RProps> {
    val theme: MuiTheme
    val css: MutableMap<String, (P) -> dynamic>

    operator fun String.invoke(block: CSSBuilder.(P) -> Unit): String {
        css[this] = { props: P -> CSSBuilder().apply { block(props) }.toDynamic }
        return this
    }
}

internal class CreateStylesBuilder<P: RProps>(
    override val theme: MuiTheme,
    override val css: MutableMap<String, (P) -> dynamic> = mutableMapOf()
): CreateStylesSet<P> {
    fun toDynamic() = js {
        css.forEach { (key, value) -> this[key] = value }
    }
}

internal val CSSBuilder.toDynamic: Any
    get() = js {
        rules.forEach {
            this[it.selector] = CSSBuilder().apply(it.block).toDynamic
        }

        declarations.forEach { (key, value) ->
            this[key.hyphenize()] = when (value) {
                is CSSBuilder -> value.toDynamic
                else -> value.toString()
            }
        }
    } as Any

internal typealias ClassesMap = Map<Enum<*>, String>
