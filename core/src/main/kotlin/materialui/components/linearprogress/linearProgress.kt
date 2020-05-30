package materialui.components.linearprogress

import materialui.LinearProgress
import materialui.components.StandardProps
import materialui.components.linearprogress.enums.LinearProgressStyle
import react.*

external interface LinearProgressProps : StandardProps {
    var color: String?
    var value: Number?
    var valueBuffer: Number?
    var variant: String?
}

fun RBuilder.linearProgress(vararg classMap: Pair<LinearProgressStyle, String>, block: LinearProgressElementBuilder.() -> Unit)
    = child(LinearProgressElementBuilder(LinearProgress, classMap.toList()).apply(block).create())
