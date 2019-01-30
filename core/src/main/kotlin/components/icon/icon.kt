package components.icon

import kotlinx.html.SPAN
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Icon")
private external val iconModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val iconComponent: RComponent<RProps, RState> = iconModule.default

fun RBuilder.icon(block: IconElementBuilder<SPAN>.() -> Unit)
    = child(IconElementBuilder(iconComponent, SPAN::class) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.icon(tag: KClass<T>, block: IconElementBuilder<T>.() -> Unit)
    = child(IconElementBuilder(iconComponent, tag).apply(block).create())
