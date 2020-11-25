package materialui.components.textfield

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.TextField
import materialui.components.formcontrol.FormControlProps
import materialui.components.formhelpertext.FormHelperTextProps
import materialui.components.input.InputProps
import materialui.components.inputlabel.InputLabelProps
import materialui.components.select.SelectProps
import react.*

external interface TextFieldProps : FormControlProps {
    var autoComplete: String?
    var autoFocus: Boolean?
    var defaultValue: Any?
    var FormHelperTextProps: FormHelperTextProps?
    var helperText: ReactElement?
    var id: String?
    var InputLabelProps: InputLabelProps?
    var InputProps: InputProps?
    var inputProps: Any?
    var inputRef: RRef?
    var label: ReactElement?
    var multiline: Boolean?
    var name: String?
    var placeholder: String?
    var rows: Any?
    var rowsMax: Any?
    var select: Boolean?
    var SelectProps: SelectProps?
    var size: String?
    var type: String?
    var value: Any?
}

fun RBuilder.textField(block: TextFieldElementBuilder<DIV>.() -> Unit)
    = child(TextFieldElementBuilder(TextField, listOf()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.textField(factory: (TagConsumer<Unit>) -> T, block: TextFieldElementBuilder<T>.() -> Unit)
    = child(TextFieldElementBuilder(TextField, listOf(), factory).apply(block).create())
