package components.fab

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Fab")
private external val fabModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val fabComponent: RComponent<RProps, RState> = fabModule.default

fun RBuilder.fab(block: FabElementBuilder<BUTTON>.() -> Unit)
    = child(FabElementBuilder(fabComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.fab(tag: KClass<T>, block: FabElementBuilder<T>.() -> Unit)
    = child(FabElementBuilder(fabComponent, tag).apply(block).create())
