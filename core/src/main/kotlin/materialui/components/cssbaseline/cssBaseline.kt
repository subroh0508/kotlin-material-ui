package materialui.components.cssbaseline

import kotlinext.js.jsObject
import react.*

@JsModule("@material-ui/core/CssBaseline")
private external val cssBaselineModule: dynamic

external interface CssBaselineProps : RProps {
    var classes: dynamic
}

fun CssBaselineProps.classes(vararg className: String) {
    classes = className.joinToString(" ")
}

@Suppress("UnsafeCastFromDynamic")
private val cssBaselineComponent: RClass<CssBaselineProps> = cssBaselineModule.default

fun RBuilder.cssBaseline(props: CssBaselineProps = jsObject(), block: RHandler<CssBaselineProps>) =
    child(cssBaselineComponent, props, block)
