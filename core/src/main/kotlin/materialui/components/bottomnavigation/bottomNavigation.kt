package materialui.components.bottomnavigation

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/BottomNavigation")
private external val bottomNavigationModule: dynamic

external interface BottomNavigationProps : StandardProps {
    var showLabels: Boolean?
    var value: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val bottomNavigationComponent: RClass<BottomNavigationProps> = bottomNavigationModule.default

fun RBuilder.bottomNavigation(rootStyle: String? = null, block: BottomNavigationElementBuilder<DIV>.() -> Unit)
    = child(BottomNavigationElementBuilder(bottomNavigationComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.bottomNavigation(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: BottomNavigationElementBuilder<T>.() -> Unit)
    = child(BottomNavigationElementBuilder(bottomNavigationComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
