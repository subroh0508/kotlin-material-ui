package materialui.components.buttonbase

import kotlinx.html.SPAN
import kotlinx.html.Tag
import materialui.components.buttonbase.enums.TouchRippleStyle
import materialui.reacttransiton.RTransitionGroupBuilder
import materialui.reacttransiton.getValue
import materialui.reacttransiton.setValue
import react.RClass

class TouchRippleElementBuilder internal constructor(
    type: RClass<TouchRippleProps>,
    classMap: List<Pair<TouchRippleStyle, String>>
) : RTransitionGroupBuilder<SPAN, TouchRippleProps>(type, classMap, { SPAN(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<TouchRippleStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.center: Boolean? by groupProps
}