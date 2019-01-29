package components.buttonbase

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/ButtonBase")
private external val buttonBaseModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val buttonBaseComponent: RComponent<RProps, RState> = buttonBaseModule.default

fun RBuilder.buttonBase(block: ButtonBaseElementBuilder<BUTTON>.() -> Unit)
    = child(ButtonBaseElementBuilder(buttonBaseComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.buttonBase(tag: KClass<T>, block: ButtonBaseElementBuilder<T>.() -> Unit)
    = child(ButtonBaseElementBuilder(buttonBaseComponent, tag).apply(block).create())
