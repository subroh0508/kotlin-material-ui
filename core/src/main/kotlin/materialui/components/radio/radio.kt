package materialui.components.radio

import materialui.Radio
import materialui.components.internal.SwitchBaseProps
import materialui.components.radio.enums.RadioStyle
import react.RBuilder

external interface RadioProps : SwitchBaseProps {
    var color: String?
}

fun RBuilder.radio(vararg classMap: Pair<RadioStyle, String>, block: RadioElementBuilder.() -> Unit)
    = child(RadioElementBuilder(Radio, classMap.toList()).apply(block).create())
