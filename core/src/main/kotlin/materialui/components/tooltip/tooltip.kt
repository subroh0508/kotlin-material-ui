package materialui.components.tooltip

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Tooltip")
private external val tooltipModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tooltipComponent: RComponent<RProps, RState> = tooltipModule.default

fun RBuilder.tooltip(block: TooltipElementBuilder.() -> Unit)
    = child(TooltipElementBuilder(tooltipComponent).apply(block).create())
