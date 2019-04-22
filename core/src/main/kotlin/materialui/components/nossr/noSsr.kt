package materialui.components.nossr

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/NoSsr")
private external val noSsrModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val noSsrComponent: RComponent<RProps, RState> = noSsrModule.default

fun RBuilder.noSsr(block: NoSsrElementBuilder.() -> Unit)
    = child(NoSsrElementBuilder(noSsrComponent).apply(block).create())
