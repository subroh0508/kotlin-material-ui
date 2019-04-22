package materialui.components.formgroup

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/FormGroup")
private external val formGroupModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val formGroupComponent: RComponent<RProps, RState> = formGroupModule.default

fun RBuilder.formGroup(block: FormGroupElementBuilder.() -> Unit)
    = child(FormGroupElementBuilder(formGroupComponent).apply(block).create())
