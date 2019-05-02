package materialui.styles.mixins

import kotlinext.js.Object.keys
import kotlinext.js.js
import kotlinx.css.CSSBuilder
import kotlin.reflect.KProperty

typealias Gutters = (CSSBuilder) -> CSSBuilder

object ReadOnlyGutterDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Gutters = { cssBuilder: CSSBuilder ->
        val gutter = thisRef.asDynamic()[property.name] as (dynamic) -> (dynamic)

        buildCssBuilder(CSSBuilder(), gutter.invoke(cssBuilder.toDynamic()))
    }
}

object GutterDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Gutters? {
        val gutter = thisRef.asDynamic()[property.name] as ((dynamic) -> (dynamic))? ?: return null

        return { cssBuilder: CSSBuilder -> buildCssBuilder(CSSBuilder(), gutter.invoke(cssBuilder.toDynamic())) }
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Gutters?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
            return
        }

        thisRef.asDynamic()[property.name] = { jsObject: dynamic ->
            value.invoke(buildCssBuilder(CSSBuilder(), jsObject)).toDynamic()
        }
    }
}

object ReadOnlyToolbarDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): CSSBuilder
        = buildCssBuilder(CSSBuilder(), thisRef.asDynamic()[property.name])
}

object ToolbarDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): CSSBuilder?
        = if (keys(thisRef.asDynamic()[property.name] as Any).isEmpty())
              null
          else
              buildCssBuilder(CSSBuilder(), thisRef.asDynamic()[property.name])

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: CSSBuilder?) {
        thisRef.asDynamic()[property.name] = value?.toDynamic()
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



private fun buildCssBuilder(cssBuilder: CSSBuilder, jsObject: dynamic): CSSBuilder
    = cssBuilder.apply {
        keys(jsObject as Any).toList().forEach { key: String ->
            when (jsObject[key]) {
                is String -> cssBuilder.declarations[key] = jsObject[key] as String
                is Number -> cssBuilder.declarations[key] = jsObject[key] as Number
                else -> key { buildCssBuilder(this, jsObject[key]) }
            }
        }
    }
