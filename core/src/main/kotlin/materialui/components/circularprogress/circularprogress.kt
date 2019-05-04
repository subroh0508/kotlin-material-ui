package materialui.components.circularprogress

import materialui.components.StandardProps
import materialui.components.circularprogress.enums.CircularProgressStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/CircularProgress")
private external val circularProgressModule: dynamic

external interface CircularProgressProps : StandardProps {
    var color: String?
    var disableShrink: Boolean?
    var size: dynamic
    var style: Any?
    var thickness: Number?
    var value: Number?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val circularProgressComponent: RClass<CircularProgressProps> = circularProgressModule.default

fun RBuilder.circularProgress(vararg classMap: Pair<CircularProgressStyle, String>, block: CircularProgressElementBuilder.() -> Unit)
    = child(CircularProgressElementBuilder(circularProgressComponent, classMap.toList()).apply(block).create())
