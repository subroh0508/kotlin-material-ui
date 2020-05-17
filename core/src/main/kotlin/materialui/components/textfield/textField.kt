package materialui.components.textfield

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.formcontrol.FormControlProps
import materialui.components.formhelpertext.FormHelperTextProps
import materialui.components.input.InputProps
import materialui.components.inputlabel.InputLabelProps
import materialui.components.select.SelectProps
import react.*

@JsModule("@material-ui/core/TextField")
private external val tableFieldModule: dynamic

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
    var type: String?
    var value: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val tableFieldComponent: RClass<TextFieldProps> = tableFieldModule.default

fun RBuilder.textField(block: TextFieldElementBuilder<DIV>.() -> Unit)
    = child(TextFieldElementBuilder(tableFieldComponent, listOf()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.textField(factory: (TagConsumer<Unit>) -> T, block: TextFieldElementBuilder<T>.() -> Unit)
    = child(TextFieldElementBuilder(tableFieldComponent, listOf(), factory).apply(block).create())
