@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.mixins

import kotlinext.js.Object
import kotlinext.js.js
import kotlinx.css.CSSBuilder

external interface Mixins {
    val gutters: (dynamic) -> dynamic
    val toolbar: dynamic
}

val Mixins.gutters: (CSSBuilder) -> CSSBuilder
    get() {
        val gutter = asDynamic()["gutters"] as (dynamic) -> (dynamic)

        return { cssBuilder: CSSBuilder ->
            val jsObject = gutter.invoke(cssBuilder.toDynamic())

            CSSBuilder().apply {
                Object.keys(jsObject as Any).toList().forEach { key ->
                    val value = jsObject[key]

                    when (value) {
                        is String, is Number -> declarations[key] = value
                        else -> key()
                    }
                }
            }
        }
    }

private fun CSSBuilder.toDynamic(): dynamic = js {
    declarations.forEach { (key, value) ->
        if (value is CSSBuilder) {
            this[key] = value.toDynamic()
        } else {
            this[key] = value
        }
    }
}

private fun buildCssBuilder(cssBuilder: CSSBuilder, jsObject: dynamic): CSSBuilder {
    Object.keys(jsObject as Any).toList().forEach { key ->
        val value = jsObject[key]

        when (value) {
            is String, is Number -> cssBuilder.declarations[key] = value
            else -> key()
        }
    }
}
