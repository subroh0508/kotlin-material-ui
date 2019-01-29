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

fun RBuilder.icon(iconName: String, block: IconElementBuilder<SPAN>.() -> Unit)
    = child(IconElementBuilder(iconName, iconComponent, SPAN::class) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.icon(tag: KClass<T>, iconName: String, block: IconElementBuilder<T>.() -> Unit)
    = child(IconElementBuilder(iconName, iconComponent, tag).apply(block).create())
