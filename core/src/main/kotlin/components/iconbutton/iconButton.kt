package components.iconbutton

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/IconButton")
private external val iconButtonModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val iconButtonComponent: RComponent<RProps, RState> = iconButtonModule.default

fun RBuilder.iconButton(block: IconButtonElementBuilder<BUTTON>.() -> Unit)
    = child(IconButtonElementBuilder(iconButtonComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.iconButton(tag: KClass<T>, block: IconButtonElementBuilder<T>.() -> Unit)
    = child(IconButtonElementBuilder(iconButtonComponent, tag).apply(block).create())