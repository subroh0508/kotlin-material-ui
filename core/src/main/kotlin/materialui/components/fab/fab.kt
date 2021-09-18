package materialui.components.fab

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Fab
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.fab.enums.FabStyle
import react.RBuilder

external interface FabProps : ButtonBaseProps {
    var color: String?
    var href: String?
    var size: String?
    var variant: String?
}

fun RBuilder.fab(vararg classMap: Pair<FabStyle, String>, block: FabElementBuilder<BUTTON>.() -> Unit) {
    child(FabElementBuilder(Fab, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.fab(vararg classMap: Pair<FabStyle, String>, factory: (TagConsumer<Unit>) -> T, block: FabElementBuilder<T>.() -> Unit) {
    child(FabElementBuilder(Fab, classMap.toList(), factory).apply(block).create())
}