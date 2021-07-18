package materialui.styles

import kotlinext.js.js
import kotlinx.css.*
import materialui.styles.muitheme.MuiTheme
import materialui.styles.muitheme.spacing
import react.RProps

class StylesBuilder<P: RProps> internal constructor(
    val theme: MuiTheme
) {
    val css: dynamic = js {  }

    fun global(block: CSSBuilder.() -> Unit) {
        css["@global"] = CSSBuilder().apply(block).toDynamic
    }

    operator fun String.invoke(block: CSSBuilder.() -> Unit): String {
        css[this] = CSSBuilder().apply(block).toDynamic
        return this
    }

    fun dynamic(name: String, block: CSSBuilder.(P) -> Unit): String {
        css[name] = { props: P -> CSSBuilder().apply { block(props) }.toDynamic }
        return name
    }

    operator fun String.invoke(builder: CSSBuilder): String {
        css[this] = builder.toDynamic
        return this
    }

    fun CSSBuilder.flip(enable: Boolean) {
        declarations["flip"] = enable
    }

    val Number.spacing: LinearDimension get() = theme.spacing(this)
    val Number.unit: LinearDimension get() = LinearDimension("${this}unit")
}

internal val CSSBuilder.toDynamic: Any
    get() = js {
        rules.forEach {
            this[it.selector] = CSSBuilder().apply(it.block).toDynamic
        }

        declarations.forEach { (key, value) ->
            this[key.hyphenize()] = when {
                key == "flip" -> value //keep boolean value parse in jss
                value is CSSBuilder -> value.toDynamic
                else -> value.toString()
            }
        }
    } as Any

internal typealias ClassesMap = Map<Enum<*>, String>
