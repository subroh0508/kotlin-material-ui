package materialui.components.portal

import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Portal")
private external val portalModule: dynamic

external interface PortalProps : RProps {
    var container: dynamic
    var disablePortal: Boolean?
    var onRendered: (() -> Unit)?
}

@Suppress("UnsafeCastFromDynamic")
private val portalComponent: RClass<PortalProps> = portalModule.default

fun RBuilder.portal(block: PortalElementBuilder.() -> Unit)
    = child(PortalElementBuilder(portalComponent).apply(block).create())
