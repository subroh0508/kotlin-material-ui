package materialui.components.grow

import kotlinext.js.js
import kotlinext.js.jsObject
import materialui.reacttransiton.RTransitionBuilder
import react.RClass

class GrowElementBuilder internal constructor(
    type: RClass<GrowProps>
) : RTransitionBuilder<GrowProps>(type, jsObject { }) {

    fun GrowProps.timeout(msec: Long) { timeout = msec }
    fun GrowProps.timeout(enter: Long? = null, exit: Long? = null) { timeout = js { this["enter"] = enter; this["exit"] = exit } }
    fun GrowProps.timeout() { timeout = "auto" }
}