package materialui.components.input

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Input")
private external val inputModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val inputComponent: RComponent<RProps, RState> = inputModule.default

fun RBuilder.input(block: InputElementBuilder.() -> Unit)
    = child(InputElementBuilder(inputComponent).apply(block).create())
