package materialui.components.linearprogress

import materialui.components.StandardProps
import materialui.components.linearprogress.enums.LinearProgressStyle
import materialui.components.linearprogress.enums.LinearProgressVariant
import react.*

@JsModule("@material-ui/core/LinearProgress")
private external val linearProgressModule: dynamic

external interface LinearProgressProps : StandardProps {
    var color: String?
    var value: Number?
    var valueBuffer: Number?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val linearProgressComponent: RClass<LinearProgressProps> = linearProgressModule.default

fun RBuilder.linearProgress(vararg classMap: Pair<LinearProgressStyle, String>, block: LinearProgressElementBuilder.() -> Unit)
    = child(LinearProgressElementBuilder(linearProgressComponent, classMap.toList()).apply(block).create())
