package materialui.components.gridlisttile

import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.gridlisttile.enums.GridListTitleStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/GridListTile")
private external val gridListTileModule: dynamic

external interface GridListTitleProps : StandardProps {
    var cols: Number?
    var rows: Number?
}

@Suppress("UnsafeCastFromDynamic")
private val gridListTileComponent: RClass<GridListTitleProps> = gridListTileModule.default

fun RBuilder.gridListTile(vararg classMap: Pair<GridListTitleStyle, String>, block: GridListTileElementBuilder<LI>.() -> Unit)
    = child(GridListTileElementBuilder(gridListTileComponent, classMap.toList()) { LI(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.gridListTile(vararg classMap: Pair<GridListTitleStyle, String>, factory: (TagConsumer<Unit>) -> T, block: GridListTileElementBuilder<T>.() -> Unit)
    = child(GridListTileElementBuilder(gridListTileComponent, classMap.toList(), factory).apply(block).create())
