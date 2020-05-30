package materialui.components.switches

import materialui.Switch
import materialui.components.internal.SwitchBaseProps
import materialui.components.switches.enums.SwitchStyle
import react.RBuilder

external interface SwitchProps : SwitchBaseProps {
    var color: String?
}

fun RBuilder.switch(vararg classMap: Pair<SwitchStyle, String>, block: SwitchElementBuilder.() -> Unit)
    = child(SwitchElementBuilder(Switch, classMap.toList()).apply(block).create())
