package components.buttonbase

import kotlinx.html.SPAN
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TouchRipple")
private external val touchRippleModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val touchRippleComponent: RComponent<RProps, RState> = touchRippleModule.default

fun RBuilder.touchRipple(block: TouchRippleElementBuilder<SPAN>.() -> Unit)
    = child(TouchRippleElementBuilder(touchRippleComponent, SPAN::class) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.touchRipple(tag: KClass<T>, block: TouchRippleElementBuilder<T>.() -> Unit)
    = child(TouchRippleElementBuilder(touchRippleComponent, tag).apply(block).create())
