package materialui.components.inputbase

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/InputBase")
private external val inputBaseModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val inputBaseComponent: RComponent<RProps, RState> = inputBaseModule.default

fun RBuilder.inputBase(block: InputBaseElementBuilder.() -> Unit)
    = child(InputBaseElementBuilder(inputBaseComponent).apply(block).create())
