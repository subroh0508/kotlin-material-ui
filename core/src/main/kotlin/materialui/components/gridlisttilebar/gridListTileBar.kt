package materialui.components.gridlisttilebar

import materialui.components.StandardProps
import materialui.components.gridlisttile.enums.GridListTitleStyle
import react.*

@JsModule("@material-ui/core/GridListTileBar")
private external val gridListTileBarModule: dynamic

external interface GridListTitleBarProps : StandardProps {
    var actionIcon: ReactElement?
    var actionPosition: String?
    var subtitle: ReactElement?
    var title: ReactElement?
    var titlePosition: String?
}

@Suppress("UnsafeCastFromDynamic")
private val gridListTileBarComponent: RClass<GridListTitleBarProps> = gridListTileBarModule.default

fun RBuilder.gridListTileBar(vararg classMap: Pair<GridListTitleStyle, String>, block: GridListTileBarElementBuilder.() -> Unit)
    = child(GridListTileBarElementBuilder(gridListTileBarComponent, classMap.toList()).apply(block).create())
