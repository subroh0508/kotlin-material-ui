package materialui.components.cssbaseline

import kotlinext.js.jsObject
import react.RBuilder
import react.RClass
import react.RProps
import react.createElement

@JsModule("@material-ui/core/CssBaseline")
private external val cssBaselineModule: dynamic

external interface CssBaselineProps : RProps

@Suppress("UnsafeCastFromDynamic")
private val cssBaselineComponent: RClass<CssBaselineProps> = cssBaselineModule.default

fun RBuilder.cssBaseline(block: RBuilder.() -> Unit)
    = child(createElement(cssBaselineComponent, jsObject<CssBaselineProps> { }, *RBuilder().apply(block).childList.toTypedArray()))
