package materialui.styles

import kotlinext.js.js
import kotlinx.css.CSSBuilder
import kotlinx.css.Overflow
import kotlinx.css.RuleSet
import kotlinx.css.hyphenize
import materialui.styles.muitheme.MuiTheme
import react.RProps

class StylesBuilder<P: RProps> internal constructor(
    val theme: MuiTheme
) {
    val css: dynamic = js {  }

    operator fun String.invoke(block: CSSBuilder.(P) -> Unit): String {
        css[this] = { props: P -> CSSBuilder().apply { block(props) }.toDynamic }
        return this
    }

    operator fun String.invoke(builder: CSSBuilder): String {
        css[this] = builder.toDynamic
        return this
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
