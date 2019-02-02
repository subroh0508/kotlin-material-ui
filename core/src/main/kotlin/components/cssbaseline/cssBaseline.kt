package components.cssbaseline

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/CssBaseline")
private external val cssBaselineModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cssBaselineComponent: RComponent<RProps, RState> = cssBaselineModule.default

fun RBuilder.cssBaseline(block: CssBaselineElementBuilder.() -> Unit)
    = child(CssBaselineElementBuilder(cssBaselineComponent).apply(block).create())
