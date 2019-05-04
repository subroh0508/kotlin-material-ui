package materialui.components.zoom

import kotlinext.js.js
import kotlinext.js.jsObject
import materialui.reacttransiton.RTransitionBuilder
import react.RClass

class ZoomElementBuilder internal constructor(
    type: RClass<ZoomProps>
) : RTransitionBuilder<ZoomProps>(type, jsObject { }) {

    fun ZoomProps.timeout(msec: Long) { timeout = msec }
    fun ZoomProps.timeout(enter: Long? = null, exit: Long? = null) { timeout = js { this["enter"] = enter; this["exit"] = exit } }
}