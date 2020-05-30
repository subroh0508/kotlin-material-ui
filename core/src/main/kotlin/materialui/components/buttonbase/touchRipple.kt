package materialui.components.buttonbase

import materialui.TouchRipple
import materialui.components.StandardProps
import materialui.components.buttonbase.enums.TouchRippleStyle
import materialui.reacttransiton.RTransitionGroupProps
import react.RBuilder

external interface TouchRippleProps : RTransitionGroupProps, StandardProps {
    var center: Boolean?
}

fun RBuilder.touchRipple(vararg classMap: Pair<TouchRippleStyle, String>, block: TouchRippleElementBuilder.() -> Unit)
    = child(TouchRippleElementBuilder(TouchRipple, classMap.toList()).apply(block).create())
