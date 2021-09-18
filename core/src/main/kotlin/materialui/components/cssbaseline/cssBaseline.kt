package materialui.components.cssbaseline

import kotlinext.js.jsObject
import materialui.CssBaseline
import react.RBuilder
import react.PropsWithChildren
import react.createElement

external interface CssBaselineProps : PropsWithChildren

fun RBuilder.cssBaseline(block: RBuilder.() -> Unit) {
    child(createElement(CssBaseline, jsObject<CssBaselineProps> { }, *RBuilder().apply(block).childList.toTypedArray()))
}