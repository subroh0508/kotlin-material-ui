package materialui.components.fade

import kotlinext.js.js
import kotlinext.js.jsObject
import materialui.reacttransiton.RTransitionBuilder
import react.ComponentType

class FadeElementBuilder internal constructor(
    type: ComponentType<FadeProps>,
    props: FadeProps = jsObject { }
) : RTransitionBuilder<FadeProps>(type, props) {

    fun FadeProps.timeout(msec: Long) { timeout = msec }
    fun FadeProps.timeout(enter: Long? = null, exit: Long? = null) { timeout = js { this["enter"] = enter; this["exit"] = exit } }
}