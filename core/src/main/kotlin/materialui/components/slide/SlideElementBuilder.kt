package materialui.components.slide

import kotlinext.js.js
import kotlinext.js.jsObject
import materialui.components.slide.enums.SlideDirection
import materialui.reacttransiton.RTransitionBuilder
import materialui.reacttransiton.getValue
import materialui.reacttransiton.setValue
import react.RClass

class SlideElementBuilder internal constructor(
    type: RClass<SlideProps>
) : RTransitionBuilder<SlideProps>(type, jsObject { }) {
    var SlideProps.direction: SlideDirection by props

    fun SlideProps.timeout(msec: Long) { timeout = msec }
    fun SlideProps.timeout(enter: Long? = null, exit: Long? = null) { timeout = js { this["enter"] = enter; this["exit"] = exit } }
}