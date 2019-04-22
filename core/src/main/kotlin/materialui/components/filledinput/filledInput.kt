package materialui.components.filledinput

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/FilledInput")
private external val filledInputModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val filledInputComponent: RComponent<RProps, RState> = filledInputModule.default

fun RBuilder.filledInput(block: FilledInputElementBuilder.() -> Unit)
    = child(FilledInputElementBuilder(filledInputComponent).apply(block).create())
