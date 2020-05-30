package materialui.components.cssbaseline

import kotlinext.js.jsObject
import materialui.CssBaseline
import react.RBuilder
import react.RProps
import react.createElement

external interface CssBaselineProps : RProps

fun RBuilder.cssBaseline(block: RBuilder.() -> Unit)
    = child(createElement(CssBaseline, jsObject<CssBaselineProps> { }, *RBuilder().apply(block).childList.toTypedArray()))
