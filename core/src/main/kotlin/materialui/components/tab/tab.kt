package materialui.components.tab

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Tab")
private external val tabModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tabComponent: RComponent<RProps, RState> = tabModule.default

fun RBuilder.tab(block: TabElementBuilder<BUTTON>.() -> Unit)
    = child(TabElementBuilder(tabComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tab(tag: KClass<T>, block: TabElementBuilder<T>.() -> Unit)
    = child(TabElementBuilder(tabComponent, tag).apply(block).create())
