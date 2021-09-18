package materialui.components.bottomnavigation

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.BottomNavigation
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder

external interface BottomNavigationProps : StandardProps {
    var showLabels: Boolean?
    var value: Any?
}

fun RBuilder.bottomNavigation(rootStyle: String? = null, block: BottomNavigationElementBuilder<DIV>.() -> Unit) {
    child(BottomNavigationElementBuilder(BottomNavigation, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { DIV(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.bottomNavigation(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: BottomNavigationElementBuilder<T>.() -> Unit) {
    child(BottomNavigationElementBuilder(BottomNavigation, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
}