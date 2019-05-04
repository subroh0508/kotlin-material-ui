package materialui.components.switches

import materialui.components.internal.SwitchBaseProps
import materialui.components.switches.enums.SwitchStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Switch")
private external val switchModule: dynamic

external interface SwitchProps : SwitchBaseProps {
    var color: String?
}

@Suppress("UnsafeCastFromDynamic")
private val switchComponent: RClass<SwitchProps> = switchModule.default

fun RBuilder.switch(vararg classMap: Pair<SwitchStyle, String>, block: SwitchElementBuilder.() -> Unit)
    = child(SwitchElementBuilder(switchComponent, classMap.toList()).apply(block).create())
