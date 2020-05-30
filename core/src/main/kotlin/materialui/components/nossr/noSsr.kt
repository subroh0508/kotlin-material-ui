package materialui.components.nossr

import materialui.NoSsr
import react.RBuilder
import react.RProps
import react.ReactElement

external interface NoSsrProps : RProps {
    var defer: Boolean?
    var fallback: ReactElement?
}

fun RBuilder.noSsr(block: NoSsrElementBuilder.() -> Unit)
    = child(NoSsrElementBuilder(NoSsr).apply(block).create())
