package components.button

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Button")
private external val buttonModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val buttonComponent: RComponent<RProps, RState> = buttonModule.default

fun RBuilder.button(block: ButtonElementBuilder<BUTTON>.() -> Unit)
    = child(ButtonElementBuilder(buttonComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.button(tag: KClass<T>, block: ButtonElementBuilder<T>.() -> Unit)
    = child(ButtonElementBuilder(buttonComponent, tag).apply(block).create())
