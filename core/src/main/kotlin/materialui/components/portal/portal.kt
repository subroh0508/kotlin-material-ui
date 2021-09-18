package materialui.components.portal

import materialui.Portal
import react.RBuilder
import react.PropsWithChildren

external interface PortalProps : PropsWithChildren {
    var container: dynamic
    var disablePortal: Boolean?
    var onRendered: (() -> Unit)?
}

fun RBuilder.portal(block: PortalElementBuilder.() -> Unit) {
    child(PortalElementBuilder(Portal).apply(block).create())
}