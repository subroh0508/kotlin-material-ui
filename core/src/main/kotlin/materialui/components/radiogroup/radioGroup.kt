package materialui.components.radiogroup

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/RadioGroup")
private external val radioGroupModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val radioGroupComponent: RComponent<RProps, RState> = radioGroupModule.default

fun RBuilder.radioGroup(block: RadioGroupElementBuilder.() -> Unit)
    = child(RadioGroupElementBuilder(radioGroupComponent).apply(block).create())
