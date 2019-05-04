package materialui.components.buttonbase

import materialui.components.StandardProps
import materialui.components.buttonbase.enums.TouchRippleStyle
import materialui.reacttransiton.RTransitionGroupProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/ButtonBase/TouchRipple")
private external val touchRippleModule: dynamic

external interface TouchRippleProps : RTransitionGroupProps, StandardProps {
    var center: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val touchRippleComponent: RClass<TouchRippleProps> = touchRippleModule.default

fun RBuilder.touchRipple(vararg classMap: Pair<TouchRippleStyle, String>, block: TouchRippleElementBuilder.() -> Unit)
    = child(TouchRippleElementBuilder(touchRippleComponent, classMap.toList()).apply(block).create())
