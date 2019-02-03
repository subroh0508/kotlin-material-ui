package components.outlinedinput

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/OutlinedInput")
private external val outlinedInputModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val outlinedInputComponent: RComponent<RProps, RState> = outlinedInputModule.default

fun RBuilder.outlinedInput(block: OutlinedInputElementBuilder.() -> Unit)
    = child(OutlinedInputElementBuilder(outlinedInputComponent).apply(block).create())
