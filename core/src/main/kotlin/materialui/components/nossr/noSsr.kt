package materialui.components.nossr

import materialui.NoSsr
import react.RBuilder
import react.PropsWithChildren
import react.ReactElement

external interface NoSsrProps : PropsWithChildren {
    var defer: Boolean?
    var fallback: ReactElement?
}

fun RBuilder.noSsr(block: NoSsrElementBuilder.() -> Unit) {
    child(NoSsrElementBuilder(NoSsr).apply(block).create())
}