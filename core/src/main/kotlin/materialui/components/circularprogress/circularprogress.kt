package materialui.components.circularprogress

import materialui.CircularProgress
import materialui.components.StandardProps
import materialui.components.circularprogress.enums.CircularProgressStyle
import react.RBuilder

external interface CircularProgressProps : StandardProps {
    var color: String?
    var disableShrink: Boolean?
    var size: dynamic
    var style: Any?
    var thickness: Number?
    var value: Number?
    var variant: String?
}

fun RBuilder.circularProgress(vararg classMap: Pair<CircularProgressStyle, String>, block: CircularProgressElementBuilder.() -> Unit)
    = child(CircularProgressElementBuilder(CircularProgress, classMap.toList()).apply(block).create())
