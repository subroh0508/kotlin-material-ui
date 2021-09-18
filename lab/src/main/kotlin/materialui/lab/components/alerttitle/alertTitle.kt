package materialui.lab.components.alerttitle

import kotlinext.js.jsObject
import react.ComponentType
import react.RBuilder
import react.PropsWithChildren
import react.createElement

@JsModule("@material-ui/lab/AlertTitle")
@JsNonModule
private external val alertTitleModule: dynamic

external interface AlertTitleProps : PropsWithChildren

@Suppress("UnsafeCastFromDynamic")
private val alertTitleComponent: ComponentType<AlertTitleProps> = alertTitleModule.default

fun RBuilder.alertTitle(block: RBuilder.() -> Unit)
        = child(createElement(alertTitleComponent, jsObject { }, *RBuilder().apply(block).childList.toTypedArray()))
