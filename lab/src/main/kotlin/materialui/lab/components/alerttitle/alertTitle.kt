package materialui.lab.components.alerttitle

import kotlinext.js.jsObject
import react.RBuilder
import react.RClass
import react.RProps
import react.createElement

@JsModule("@material-ui/lab/AlertTitle")
@JsNonModule
private external val alertTitleModule: dynamic

external interface AlertTitleProps : RProps

@Suppress("UnsafeCastFromDynamic")
private val alertTitleComponent: RClass<AlertTitleProps> = alertTitleModule.default

fun RBuilder.alertTitle(block: RBuilder.() -> Unit)
        = child(createElement(alertTitleComponent, jsObject<AlertTitleProps> { }, *RBuilder().apply(block).childList.toTypedArray()))
