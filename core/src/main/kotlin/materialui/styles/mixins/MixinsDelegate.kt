package materialui.styles.mixins

import kotlinext.js.Object
import kotlinext.js.js
import kotlinx.css.CssBuilder
import kotlinx.css.px
import kotlin.reflect.KProperty

typealias Gutters = (CssBuilder) -> CssBuilder

object ReadOnlyGutterDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Gutters = { cssBuilder: CssBuilder ->
        val gutter = thisRef.asDynamic()[property.name] as (dynamic) -> (dynamic)

        buildCssBuilder(CssBuilder(), gutter.invoke(cssBuilder.toDynamic()))
    }
}

object GutterDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Gutters? {
        val gutter = thisRef.asDynamic()[property.name] as ((dynamic) -> (dynamic))? ?: return null

        return { cssBuilder: CssBuilder -> buildCssBuilder(CssBuilder(), gutter.invoke(cssBuilder.toDynamic())) }
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Gutters?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
            return
        }

        thisRef.asDynamic()[property.name] = { jsObject: dynamic ->
            value.invoke(buildCssBuilder(CssBuilder(), jsObject)).toDynamic()
        }
    }
}

object ReadOnlyToolbarDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): CssBuilder
        = buildCssBuilder(CssBuilder(), thisRef.asDynamic()[property.name])
}

object ToolbarDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): CssBuilder?
        = if (Object.keys(thisRef.asDynamic()[property.name] as Any).isEmpty())
              null
          else
              buildCssBuilder(CssBuilder(), thisRef.asDynamic()[property.name])

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: CssBuilder?) {
        thisRef.asDynamic()[property.name] = value?.toDynamic()
    }
}

private fun CssBuilder.toDynamic(): dynamic = js {
    declarations.forEach { (key, value) ->
        if (value is CssBuilder) {
            this[key] = value.toDynamic()
        } else {
            this[key] = value
        }
    }
}



private fun buildCssBuilder(cssBuilder: CssBuilder, jsObject: dynamic): CssBuilder
    = cssBuilder.apply {
        Object.keys(jsObject as Any).toList().forEach { key: String ->
            when (jsObject[key]) {
                is String -> cssBuilder.declarations[key] = jsObject[key] as String
                is Number -> cssBuilder.declarations[key] = (jsObject[key] as Number).px
                else -> key { buildCssBuilder(this, jsObject[key]) }
            }
        }
    }
