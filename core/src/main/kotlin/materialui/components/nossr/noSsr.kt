package materialui.components.nossr

import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement

@JsModule("@material-ui/core/NoSsr")
private external val noSsrModule: dynamic

external interface NoSsrProps : RProps {
    var defer: Boolean?
    var fallback: ReactElement?
}

@Suppress("UnsafeCastFromDynamic")
private val noSsrComponent: RClass<NoSsrProps> = noSsrModule.default

fun RBuilder.noSsr(block: NoSsrElementBuilder.() -> Unit)
    = child(NoSsrElementBuilder(noSsrComponent).apply(block).create())
