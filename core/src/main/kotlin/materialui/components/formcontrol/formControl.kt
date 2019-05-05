package materialui.components.formcontrol

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.formcontrol.enums.FormControlStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/FormControl")
private external val formControlModule: dynamic

external interface FormControlProps : StandardProps {
    var disabled: Boolean?
    var error: Boolean?
    var fullWidth: Boolean?
    var margin: String?
    var required: Boolean?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val formControlComponent: RClass<FormControlProps> = formControlModule.default

fun RBuilder.formControl(vararg classMap: Pair<FormControlStyle, String>, block: FormControlElementBuilder<DIV, FormControlProps>.() -> Unit)
    = child(FormControlElementBuilder(formControlComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.formControl(vararg classMap: Pair<FormControlStyle, String>, factory: (TagConsumer<Unit>) -> T, block: FormControlElementBuilder<T, FormControlProps>.() -> Unit)
    = child(FormControlElementBuilder(formControlComponent, classMap.toList(), factory).apply(block).create())
