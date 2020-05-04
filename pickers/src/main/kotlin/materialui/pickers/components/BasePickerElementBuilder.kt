package materialui.pickers.components

import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RClass
import react.ReactElement
import react.createElement
import react.dom.RDOMBuilder

abstract class BasePickerElementBuilder<T: Tag, Props: BasePickerProps> internal constructor(
    private val type: RClass<Props>,
    className: String?,
    factory: (TagConsumer<Unit>) -> T
) : RDOMBuilder<T>(factory) {
    protected val pickerProps: Props = jsObject { }

    var Tag.className: String? by pickerProps

    init { attrs.className = className }

    override fun create(): ReactElement {
        Object.keys(pickerProps).forEach { key -> setProp(key, pickerProps[key]) }

        return createElement(type, props, *childList.toTypedArray())
    }
}
