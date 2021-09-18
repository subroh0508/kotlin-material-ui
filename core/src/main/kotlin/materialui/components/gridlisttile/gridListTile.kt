package materialui.components.gridlisttile

import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.GridListTile
import materialui.components.StandardProps
import materialui.components.gridlisttile.enums.GridListTitleStyle
import react.RBuilder

external interface GridListTileProps : StandardProps {
    var cols: Number?
    var rows: Number?
}

fun RBuilder.gridListTile(vararg classMap: Pair<GridListTitleStyle, String>, block: GridListTileElementBuilder<LI>.() -> Unit) {
    child(GridListTileElementBuilder(GridListTile, classMap.toList()) { LI(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.gridListTile(vararg classMap: Pair<GridListTitleStyle, String>, factory: (TagConsumer<Unit>) -> T, block: GridListTileElementBuilder<T>.() -> Unit) {
    child(GridListTileElementBuilder(GridListTile, classMap.toList(), factory).apply(block).create())
}