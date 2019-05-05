package materialui.components.inputbase

import materialui.components.StandardProps
import materialui.components.inputbase.enums.InputBaseStyle
import org.w3c.dom.events.Event
import react.*

@JsModule("@material-ui/core/InputBase")
private external val inputBaseModule: dynamic

external interface InputBaseProps : StandardProps {
    var autoComplete: String?
    var autoFocus: Boolean?
    var defaultValue: Any?
    var disabled: Boolean?
    var endAdornment: ReactElement?
    var error: Boolean?
    var fullWidth: Boolean?
    var id: String?
    var inputComponent: dynamic
    var inputProps: RProps?
    var inputRef: RRef?
    var margin: String?
    var muiFormControl: Any?
    var multiline: Boolean?
    var name: String?
    var onEmpty: ((Event) -> Unit)?
    var onFilled: ((Event) -> Unit)?
    var placeholder: String?
    var readOnly: Boolean?
    var required: Boolean?
    var rows: dynamic
    var rowsMax: dynamic
    var startAdornment: ReactElement?
    var type: String?
    var value: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val inputBaseComponent: RClass<InputBaseProps> = inputBaseModule.default

fun RBuilder.inputBase(vararg classMap: Pair<InputBaseStyle, String>, block: InputBaseElementBuilder<InputBaseProps>.() -> Unit)
    = child(InputBaseElementBuilder(inputBaseComponent, classMap.toList()).apply(block).create())
