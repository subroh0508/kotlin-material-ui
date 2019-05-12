package materialui.styles

import kotlinext.js.js
import kotlinx.css.CSSBuilder
import kotlinx.css.RuleSet
import kotlinx.css.hyphenize
import materialui.styles.muitheme.MuiTheme

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