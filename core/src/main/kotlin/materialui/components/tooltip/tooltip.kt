package materialui.components.tooltip

import materialui.components.StandardProps
import materialui.components.tooltip.enums.TooltipPlacement
import materialui.components.tooltip.enums.TooltipStyle
import materialui.reacttransiton.RTransitionProps
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement

@JsModule("@material-ui/core/Tooltip")
private external val tooltipModule: dynamic

external interface TooltipProps : StandardProps {
    var disableFocusListener: Boolean?
    var disableHoverListener: Boolean?
    var disableTouchListener: Boolean?
    var enterDelay: Number?
    var enterTouchDelay: Number?
    var id: String?
    var interactive: Boolean?
    var leaveDelay: Number?
    var leaveTouchDelay: Number?
    var onClose: ((Event) -> Unit)?
    var onOpen: ((Event) -> Unit)?
    var open: Boolean?
    var PopperProps: RProps?
    var theme: Any?
    var title: ReactElement?
    var TransitionComponent: dynamic
    var TransitionProps: RTransitionProps?
}

var TooltipProps.placement: TooltipPlacement?
    get() = (asDynamic()["placement"] as String?)?.let { TooltipPlacement.valueOf(it) }
    set(value) { asDynamic()["placement"] = value?.toString() }

@Suppress("UnsafeCastFromDynamic")
private val tooltipComponent: RClass<TooltipProps> = tooltipModule.default

fun RBuilder.tooltip(vararg classMap: Pair<TooltipStyle, String>, block: TooltipElementBuilder.() -> Unit)
    = child(TooltipElementBuilder(tooltipComponent, classMap.toList()).apply(block).create())
