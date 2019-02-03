package components.tabs

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Tabs")
private external val tabsModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tabsComponent: RComponent<RProps, RState> = tabsModule.default

fun RBuilder.tabs(block: TabsElementBuilder<DIV>.() -> Unit)
    = child(TabsElementBuilder(tabsComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tabs(tag: KClass<T>, block: TabsElementBuilder<T>.() -> Unit)
    = child(TabsElementBuilder(tabsComponent, tag).apply(block).create())
