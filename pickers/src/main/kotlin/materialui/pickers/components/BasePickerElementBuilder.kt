package materialui.pickers.components

import kotlinext.js.jsObject
import materialui.pickers.components.enums.PickerOrientation
import react.*
import kotlin.js.Date
import kotlin.reflect.KClass

abstract class BasePickerElementBuilder<Props: BasePickerProps> internal constructor(
    private val type: RClass<Props>,
    className: String?,
    props: Props = jsObject { }
) : RElementBuilder<Props>(props) {
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
    fun <P: ToolbarComponentProps, C: Component<P, *>> Props.ToolbarComponent(kClass: KClass<C>) { ToolbarComponent = kClass.rClass }
    @Suppress("FunctionName")
    fun <P: ToolbarComponentProps> Props.ToolbarComponent(functionalComponent: FunctionalComponent<P>) { ToolbarComponent = functionalComponent }

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
    fun <P: DateInputProps, C: Component<P, *>> Props.KeyboardDateInputComponent(kClass: KClass<C>) { KeyboardDateInputComponent = kClass.rClass }
    @Suppress("FunctionName")
    fun <P: DateInputProps> Props.KeyboardDateInputComponent(functionalComponent: FunctionalComponent<P>) { KeyboardDateInputComponent = functionalComponent }

    @Suppress("FunctionName")
    fun <P: DateInputProps, C: Component<P, *>> Props.PureDateInputComponent(kClass: KClass<C>) { PureDateInputComponent = kClass.rClass }
    @Suppress("FunctionName")
    fun <P: DateInputProps> Props.PureDateInputComponent(functionalComponent: FunctionalComponent<P>) { PureDateInputComponent = functionalComponent }

    /* TextFieldProps */
    fun Props.defaultValue(v: String?) { defaultValue = v }
    fun Props.defaultValue(v: Number?) { defaultValue = v }
    fun Props.defaultValue(v: Date?) { defaultValue = v }

    @Suppress("PropertyName")
    var RProps.FormHelperTextProps: RProps? by props
    fun Props.helperText(block: RBuilder.() -> Unit) { helperText = buildElement(block) }

    @Suppress("PropertyName")
    var RProps.InputLabelProps: RProps? by props

    @Suppress("PropertyName")
    var RProps.InputProps: RProps? by props
    var RProps.inputProps: Any? by props

    fun Props.label(block: RBuilder.() -> Unit) { label = buildElement(block) }

    fun Props.rows(v: String) { rows = v }
    fun Props.rows(v: Number) { rows = v }

    fun Props.rowsMax(v: String) { rowsMax = v }
    fun Props.rowsMax(v: Number) { rowsMax = v }

    @Suppress("PropertyName")
    var RProps.SelectProps: RProps? by props
}
