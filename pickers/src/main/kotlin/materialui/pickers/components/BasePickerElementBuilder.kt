package materialui.pickers.components

import kotlinext.js.jsObject
import kotlinx.html.INPUT
import materialui.components.formhelpertext.FormHelperTextProps
import materialui.components.input.InputProps
import materialui.components.inputlabel.InputLabelProps
import materialui.components.select.SelectProps
import materialui.pickers.components.enums.PickerOrientation
import react.*
import react.dom.RDOMBuilderImpl
import react.dom.attrs
import react.dom.input
import kotlin.js.Date
import kotlin.reflect.KClass

abstract class BasePickerElementBuilder<Props: BasePickerProps> internal constructor(
    private val type: ComponentType<Props>,
    className: String?,
    props: Props = jsObject { }
) : RElementBuilderImpl<Props>(props) {
    init { props.className = className }

    fun create() = createElement(type, attrs, *childList.toTypedArray())

    fun Props.value(v: String?) { value = v }
    fun Props.value(v: Number?) { value = v }
    fun Props.value(v: Date?) { value = v }

    fun Props.onChangeFunc(block: (Any, String?) -> Unit) { onChange = block }
    fun Props.onAcceptFunc(block: (Any) -> Unit) { onAccept = block }
    fun Props.onErrorFunc(block: (Any, Any) -> Unit) { onError = block }
    fun Props.onOpenFunc(block: () -> Unit) { onOpen = block }
    fun Props.onCloseFunc(block: () -> Unit) { onClose = block }

    fun Props.orientation(v: PickerOrientation?) { orientation = v?.name }

    @Suppress("FunctionName")
    fun <P: ToolbarComponentProps, C: Component<P, *>> Props.ToolbarComponent(kClass: KClass<C>) { ToolbarComponent = kClass.react }
    @Suppress("FunctionName")
    fun <P: ToolbarComponentProps> Props.ToolbarComponent(functionComponent: FunctionComponent<P>) { ToolbarComponent = functionComponent }

    fun Props.toolbarTitle(block: RBuilder.() -> Unit) { toolbarTitle = buildElement(block) }

    /* DateValidationProps */
    fun Props.invalidDateMessage(block: RBuilder.() -> Unit) { invalidDateMessage = buildElement(block) }
    fun Props.minDateMessage(block: RBuilder.() -> Unit) { minDateMessage = buildElement(block) }
    fun Props.maxDateMessage(block: RBuilder.() -> Unit) { maxDateMessage = buildElement(block) }

    /* ExportedPickerProps */
    fun Props.dateRangeIcon(block: RBuilder.() -> Unit) { dateRangeIcon = buildElement(block) }
    fun Props.timeIcon(block: RBuilder.() -> Unit) { timeIcon = buildElement(block) }

    /* PickerWrapper */
    fun Props.toggleMobileKeyboardView(block: () -> Unit) { toggleMobileKeyboardView = block }

    @Suppress("FunctionName")
    fun Props.DateInputProps(block: DateInputProps.() -> Unit) { DateInputProps = jsObject(block) }
    fun Props.onDateChange(block: (Any, String, Boolean) -> Unit) { onDateChange = block }

    @Suppress("FunctionName")
    fun <P: DateInputProps, C: Component<P, *>> Props.KeyboardDateInputComponent(kClass: KClass<C>) { KeyboardDateInputComponent = kClass.react }
    @Suppress("FunctionName")
    fun <P: DateInputProps> Props.KeyboardDateInputComponent(functionComponent: FunctionComponent<P>) { KeyboardDateInputComponent = functionComponent }

    @Suppress("FunctionName")
    fun <P: DateInputProps, C: Component<P, *>> Props.PureDateInputComponent(kClass: KClass<C>) { PureDateInputComponent = kClass.react }
    @Suppress("FunctionName")
    fun <P: DateInputProps> Props.PureDateInputComponent(functionComponent: FunctionComponent<P>) { PureDateInputComponent = functionComponent }

    /* TextFieldProps */
    fun Props.defaultValue(v: String?) { defaultValue = v }
    fun Props.defaultValue(v: Number?) { defaultValue = v }
    fun Props.defaultValue(v: Date?) { defaultValue = v }

    @Suppress("FunctionName")
    fun Props.FormHelperTextProps(block: FormHelperTextProps.() -> Unit) { FormHelperTextProps = jsObject(block) }
    fun Props.helperText(block: RBuilder.() -> Unit) { helperText = buildElement(block) }

    @Suppress("FunctionName")
    fun Props.InputLabelProps(block: InputLabelProps.() -> Unit) { InputLabelProps = jsObject(block) }

    @Suppress("FunctionName")
    fun Props.InputProps(block: InputProps.() -> Unit) { InputProps = jsObject(block) }
    fun Props.inputProps(block: INPUT.() -> Unit) { inputProps = RDOMBuilderImpl { INPUT(mapOf(), it) }.apply { input { attrs(block) } }.domProps }

    fun Props.label(block: RBuilder.() -> Unit) { label = buildElement(block) }

    fun Props.rows(v: String) { rows = v }
    fun Props.rows(v: Number) { rows = v }

    fun Props.rowsMax(v: String) { rowsMax = v }
    fun Props.rowsMax(v: Number) { rowsMax = v }

    @Suppress("FunctionName")
    fun Props.SelectProps(block: SelectProps.() -> Unit) { SelectProps = jsObject(block) }
}
