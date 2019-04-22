package materialui.components.bottomnavigationaction

import materialui.components.bottomnavigation.BottomNavigationElementBuilder
import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/BottomNavigationAction")
private external val bottomNavigationActionModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val bottomNavigationActionComponent: RComponent<RProps, RState> = bottomNavigationActionModule.default

fun RBuilder.bottomNavigationAction(block: BottomNavigationElementBuilder<BUTTON>.() -> Unit)
    = child(BottomNavigationElementBuilder(bottomNavigationActionComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.bottomNavigationAction(tag: KClass<T>, block: BottomNavigationElementBuilder<T>.() -> Unit)
    = child(BottomNavigationElementBuilder(bottomNavigationActionComponent, tag).apply(block).create())
