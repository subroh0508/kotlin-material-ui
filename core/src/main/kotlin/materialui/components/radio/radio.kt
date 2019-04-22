package materialui.components.radio

import materialui.components.radio.values.RadioValue
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Radio")
private external val radioModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val radioComponent: RComponent<RProps, RState> = radioModule.default

fun RBuilder.radio(block: RadioElementBuilder.() -> Unit)
    = child(RadioElementBuilder(radioComponent).apply(block).create())

fun rv(v: String) = RadioValue(v)
fun rv(v: Number) = RadioValue(v)
fun rv(v: Boolean) = RadioValue(v)