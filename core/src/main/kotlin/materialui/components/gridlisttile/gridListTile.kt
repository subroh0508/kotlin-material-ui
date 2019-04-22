package materialui.components.gridlisttile

import kotlinx.html.LI
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/GridListTile")
private external val gridListTileModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val gridListTileComponent: RComponent<RProps, RState> = gridListTileModule.default

fun RBuilder.gridListTile(block: GridListTileElementBuilder<LI>.() -> Unit)
    = child(GridListTileElementBuilder(gridListTileComponent, LI::class) { LI(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.gridListTile(tag: KClass<T>, block: GridListTileElementBuilder<T>.() -> Unit)
    = child(GridListTileElementBuilder(gridListTileComponent, tag).apply(block).create())
