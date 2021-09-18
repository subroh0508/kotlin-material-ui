package materialui.components.gridlisttilebar

import materialui.GridListTileBar
import materialui.components.StandardProps
import materialui.components.gridlisttile.enums.GridListTitleStyle
import react.*

external interface GridListTileBarProps : StandardProps {
    var actionIcon: ReactElement?
    var actionPosition: String?
    var subtitle: ReactElement?
    var title: ReactElement?
    var titlePosition: String?
}

fun RBuilder.gridListTileBar(vararg classMap: Pair<GridListTitleStyle, String>, block: GridListTileBarElementBuilder.() -> Unit) {
    child(GridListTileBarElementBuilder(GridListTileBar, classMap.toList()).apply(block).create())
}