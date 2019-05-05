package materialui.components.formgroup

import materialui.components.StandardProps
import materialui.components.formgroup.enums.FormGroupStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/FormGroup")
private external val formGroupModule: dynamic

external interface FormGroupProps : StandardProps {
    var row: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val formGroupComponent: RClass<FormGroupProps> = formGroupModule.default

fun RBuilder.formGroup(vararg classMap: Pair<FormGroupStyle, String>, block: FormGroupElementBuilder<FormGroupProps>.() -> Unit)
    = child(FormGroupElementBuilder(formGroupComponent, classMap.toList()).apply(block).create())
