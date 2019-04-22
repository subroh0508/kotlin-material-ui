package materialui.components.formcontrollabel

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/FormControlLabel")
private external val formControlLabelModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val formControlLabelComponent: RComponent<RProps, RState> = formControlLabelModule.default

fun RBuilder.formControlLabel(block: FormControlLabelElementBuilder.() -> Unit)
    = child(FormControlLabelElementBuilder(formControlLabelComponent).apply(block).create())
