package materialui.pickers.components

import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.*
import react.dom.RDOMBuilder
import kotlin.js.Date
import kotlin.reflect.KClass

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

    var Tag.value: Any? by pickerProps
    fun Tag.value(v: String?) { value = v }
    fun Tag.value(v: Number?) { value = v }
    fun Tag.value(v: Date?) { value = v }

    var Tag.onChange: ((dynamic, String?) -> Unit)? by pickerProps
    fun Tag.onChange(block: (Any, String?) -> Unit) { onChange = block }

    var Tag.autoOk: Boolean? by pickerProps
    var Tag.inputFormat: String? by pickerProps
    var Tag.disabled: Boolean? by pickerProps
    var Tag.readOnly: Boolean? by pickerProps

    var Tag.defaultHighlight: Any? by pickerProps

    var Tag.onAccept: ((dynamic) -> Unit)? by pickerProps
    fun Tag.onAccept(block: (Any) -> Unit) { onAccept = block }

    var Tag.onError: ((dynamic, dynamic) -> Unit)? by pickerProps
    fun Tag.onError(block: (Any, Any) -> Unit) { onError = block }

    var Tag.onOpen: (() -> Unit)? by pickerProps
    fun Tag.onOpen(block: () -> Unit) { onOpen = block }

    var Tag.onClose: (() -> Unit)? by pickerProps
    fun Tag.onClose(block: () -> Unit) { onClose = block }

    var Tag.open: Boolean? by pickerProps
    var Tag.showToolbar: Boolean? by pickerProps
    var Tag.orientation: PickerOrientation? by pickerProps
    @Suppress("PropertyName")
    var Tag.ToolbarComponent: Any? by pickerProps
    @Suppress("FunctionName")
    fun <P: ToolbarComponentProps, C: Component<P, *>> Tag.ToolbarComponent(kClass: KClass<C>) { ToolbarComponent = kClass.rClass }
    @Suppress("FunctionName")
    fun <P: ToolbarComponentProps> Tag.ToolbarComponent(functionalComponent: FunctionalComponent<P>) { ToolbarComponent = functionalComponent }

    var Tag.toolbarTitle: Any? by pickerProps
    fun Tag.toolbarTitle(block: RBuilder.() -> Unit) { toolbarTitle = buildElement(block) }

    var Tag.toolbarFormat: String? by pickerProps
}
