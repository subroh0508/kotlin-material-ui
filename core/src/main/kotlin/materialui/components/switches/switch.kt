package materialui.components.switches

import materialui.components.switches.values.SwitchValue
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Switch")
private external val switchModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val switchComponent: RComponent<RProps, RState> = switchModule.default

fun RBuilder.switch(block: SwitchElementBuilder.() -> Unit)
    = child(SwitchElementBuilder(switchComponent).apply(block).create())

fun sv(v: String) = SwitchValue(v)
fun sv(v: Number) = SwitchValue(v)
fun sv(v: Boolean) = SwitchValue(v)
