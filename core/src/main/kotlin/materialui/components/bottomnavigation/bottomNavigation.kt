package materialui.components.bottomnavigation

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/BottomNavigation")
private external val bottomNavigationModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val bottomNavigationComponent: RComponent<RProps, RState> = bottomNavigationModule.default

fun RBuilder.bottomNavigation(block: BottomNavigationElementBuilder<DIV>.() -> Unit)
    = child(BottomNavigationElementBuilder(bottomNavigationComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.bottomNavigation(tag: KClass<T>, block: BottomNavigationElementBuilder<T>.() -> Unit)
    = child(BottomNavigationElementBuilder(bottomNavigationComponent, tag).apply(block).create())
