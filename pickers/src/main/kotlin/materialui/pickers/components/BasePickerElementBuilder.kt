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
    var RProps.className: String? by props

    init { props.className = className }

    fun create() = createElement(type, attrs, *childList.toTypedArray())

    var RProps.value: Any? by props
    fun RProps.value(v: String?) { value = v }
    fun RProps.value(v: Number?) { value = v }
    fun RProps.value(v: Date?) { value = v }

    var RProps.onChange: ((dynamic, String?) -> Unit)? by props
    fun RProps.onChange(block: (Any, String?) -> Unit) { onChange = block }

    var RProps.autoOk: Boolean? by props
    var RProps.inputFormat: String? by props
    var RProps.disabled: Boolean? by props
    var RProps.readOnly: Boolean? by props

    var RProps.defaultHighlight: Any? by props

    var RProps.onAccept: ((dynamic) -> Unit)? by props
    fun RProps.onAccept(block: (Any) -> Unit) { onAccept = block }

    var RProps.onError: ((dynamic, dynamic) -> Unit)? by props
    fun RProps.onError(block: (Any, Any) -> Unit) { onError = block }

    var RProps.onOpen: (() -> Unit)? by props
    fun RProps.onOpen(block: () -> Unit) { onOpen = block }

    var RProps.onClose: (() -> Unit)? by props
    fun RProps.onClose(block: () -> Unit) { onClose = block }

    var RProps.open: Boolean? by props
    var RProps.showToolbar: Boolean? by props
    var RProps.orientation: PickerOrientation? by props
    var RProps.toolbarFormat: String? by props

    @Suppress("PropertyName")
    var RProps.ToolbarComponent: Any? by props
    @Suppress("FunctionName")
    fun <P: ToolbarComponentProps, C: Component<P, *>> RProps.ToolbarComponent(kClass: KClass<C>) { ToolbarComponent = kClass.rClass }
    @Suppress("FunctionName")
    fun <P: ToolbarComponentProps> RProps.ToolbarComponent(functionalComponent: FunctionalComponent<P>) { ToolbarComponent = functionalComponent }

    var RProps.toolbarTitle: Any? by props
    fun RProps.toolbarTitle(block: RBuilder.() -> Unit) { toolbarTitle = buildElement(block) }

    /* DateValidationProps */
    var RProps.invalidDateMessage: Any? by props
    fun RProps.invalidDateMessage(block: RBuilder.() -> Unit) { invalidDateMessage = buildElement(block) }

    var RProps.minDateMessage: Any? by props
    fun RProps.minDateMessage(block: RBuilder.() -> Unit) { minDateMessage = buildElement(block) }

    var RProps.maxDateMessage: Any? by props
    fun RProps.maxDateMessage(block: RBuilder.() -> Unit) { maxDateMessage = buildElement(block) }

    var RProps.strictCompareDate: Boolean? by props

    /* ExportedPickerProps */
    var RProps.hideTabs: Boolean? by props

    var RProps.dateRangeIcon: Any? by props
    fun RProps.dateRangeIcon(block: RBuilder.() -> Unit) { dateRangeIcon = buildElement(block) }

    var RProps.timeIcon: Any? by props
    fun RProps.timeIcon(block: RBuilder.() -> Unit) { timeIcon = buildElement(block) }

    /* PickerWrapper */
    var RProps.isMobileKeyboardViewOpen: Boolean? by props

    var RProps.toggleMobileKeyboardView: (() -> Unit)? by props
    fun RProps.toggleMobileKeyboardView(block: () -> Unit) { toggleMobileKeyboardView = block }

    var RProps.date: Any? by props

    @Suppress("PropertyName")
    var RProps.DateInputProps: DateInputProps? by props
    @Suppress("FunctionName")
    fun RProps.DateInputProps(block: DateInputProps.() -> Unit) { DateInputProps = jsObject(block) }

    var RProps.onDateChange: ((dynamic, String, dynamic) -> Unit)? by props
    fun RProps.onDateChange(block: (Any, String, Boolean) -> Unit) { onDateChange = block }

    @Suppress("PropertyName")
    var RProps.KeyboardDateInputComponent: Any? by props
    @Suppress("FunctionName")
    fun <P: DateInputProps, C: Component<P, *>> RProps.KeyboardDateInputComponent(kClass: KClass<C>) { KeyboardDateInputComponent = kClass.rClass }
    @Suppress("FunctionName")
    fun <P: DateInputProps> RProps.KeyboardDateInputComponent(functionalComponent: FunctionalComponent<P>) { KeyboardDateInputComponent = functionalComponent }

    @Suppress("PropertyName")
    var RProps.PureDateInputComponent: Any? by props
    @Suppress("FunctionName")
    fun <P: DateInputProps, C: Component<P, *>> RProps.PureDateInputComponent(kClass: KClass<C>) { PureDateInputComponent = kClass.rClass }
    @Suppress("FunctionName")
    fun <P: DateInputProps> RProps.PureDateInputComponent(functionalComponent: FunctionalComponent<P>) { PureDateInputComponent = functionalComponent }

    /* TextFieldProps */
    var RProps.autoComplete: String? by props
    var RProps.autoFocus: Boolean? by props

    var RProps.defaultValue: Any? by props
    fun RProps.defaultValue(v: String?) { defaultValue = v }
    fun RProps.defaultValue(v: Number?) { defaultValue = v }
    fun RProps.defaultValue(v: Date?) { defaultValue = v }

    @Suppress("PropertyName")
    var RProps.FormHelperTextProps: RProps? by props
    var RProps.helperText: ReactElement? by props
    var RProps.id: String? by props

    @Suppress("PropertyName")
    var RProps.InputLabelProps: RProps? by props

    @Suppress("PropertyName")
    var RProps.InputProps: RProps? by props
    var RProps.inputProps: Any? by props
    var RProps.inputRef: RRef? by props

    var RProps.label: ReactElement? by props
    fun RProps.label(block: RBuilder.() -> Unit) { label = buildElement(block) }

    var RProps.multiline: Boolean? by props
    var RProps.name: String? by props
    var RProps.placeholder: String? by props

    var RProps.rows: Any? by props
    fun RProps.rows(v: String) { rows = v }
    fun RProps.rows(v: Number) { rows = v }

    var RProps.rowsMax: Any? by props
    fun RProps.rowsMax(v: String) { rowsMax = v }
    fun RProps.rowsMax(v: Number) { rowsMax = v }

    var RProps.select: Boolean? by props

    @Suppress("PropertyName")
    var RProps.SelectProps: RProps? by props
    var RProps.type: String? by props
}
