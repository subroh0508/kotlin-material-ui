package materialui.pickers.components

import materialui.components.iconbutton.IconButtonProps
import materialui.components.input.InputProps
import materialui.components.inputadornment.InputAdornmentProps
import materialui.components.textfield.TextFieldProps
import react.PropsWithChildren
import kotlin.js.RegExp

interface DateInputProps : PropsWithChildren {
    var open: Boolean?
    var rawValue: dynamic
    var parsedDateValue: dynamic
    var inputFormat: String?
    var onChange: ((dynamic, String?) -> Unit)?
    var openPicker: (() -> Unit)?
    var readOnly: Boolean?
    var disabled: Boolean?
    var validationError: dynamic
    var label: dynamic
    @Suppress("PropertyName")
    var InputProps: InputProps?
    @Suppress("PropertyName")
    var TextFieldProps: TextFieldProps?
    var ignoreInvalidInputs: Boolean
    var renderInput: ((TextFieldProps) -> Any)?
    var emptyInputText: String?
    var openPickerIcon: dynamic
    var mask: String?
    var acceptRegex: RegExp?
    @Suppress("PropertyName")
    var InputAdornmentProps: InputAdornmentProps?
    @Suppress("PropertyName")
    var KeyboardButtonProps: IconButtonProps?
    var rifmFormatter: ((String) -> String)?
    var disableOpenPicker: Boolean?
    var disableMaskedInput: Boolean?
    var getOpenDialogAriaText: ((dynamic, dynamic) -> String)?
}
