package materialui.components.portal

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Portal")
private external val portalModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val portalComponent: RComponent<RProps, RState> = portalModule.default

fun RBuilder.portal(block: PortalElementBuilder.() -> Unit)
    = child(PortalElementBuilder(portalComponent).apply(block).create())
