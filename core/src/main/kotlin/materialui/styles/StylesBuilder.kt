package materialui.styles

import kotlinext.js.js
import kotlinx.css.*
import materialui.styles.muitheme.MuiTheme
import materialui.styles.muitheme.spacing
import react.PropsWithChildren

class StylesBuilder<P: PropsWithChildren> internal constructor(
    val theme: MuiTheme
) {
    val css: dynamic = js {  }

    fun global(block: CssBuilder.() -> Unit) {
        css["@global"] = CssBuilder().apply(block).toDynamic
    }

    operator fun String.invoke(block: CssBuilder.() -> Unit): String {
        css[this] = CssBuilder().apply(block).toDynamic
        return this
    }

    fun dynamic(name: String, block: CssBuilder.(P) -> Unit): String {
        css[name] = { props: P -> CssBuilder().apply { block(props) }.toDynamic }
        return name
    }

    operator fun String.invoke(builder: CssBuilder): String {
        css[this] = builder.toDynamic
        return this
    }

    fun CssBuilder.flip(enable: Boolean) {
        declarations["flip"] = enable
    }

    val Number.spacing: LinearDimension get() = theme.spacing(this)
    val Number.unit: LinearDimension get() = LinearDimension("${this}unit")
}

internal val CssBuilder.toDynamic: Any
    get() = js {
        rules.forEach {
            this[it.selector] = CssBuilder().apply(it.block).toDynamic
        }

        declarations.forEach { (key, value) ->
            this[key.hyphenize()] = when {
                key == "flip" -> value //keep boolean value parse in jss
                value is CssBuilder -> value.toDynamic
                else -> value.toString()
            }
        }
    } as Any

internal typealias ClassesMap = Map<Enum<*>, String>
