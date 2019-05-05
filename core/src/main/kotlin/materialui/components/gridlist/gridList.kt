package materialui.components.gridlist

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/GridList")
private external val gridListModule: dynamic

external interface GridListProps : StandardProps {
    var cellHeight: Any?
    var cols: Number?
    var spacing: Number?
    var style: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val gridListComponent: RClass<GridListProps> = gridListModule.default

fun RBuilder.gridList(rootStyle: String? = null, block: GridListElementBuilder<UL>.() -> Unit)
    = child(GridListElementBuilder(gridListComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { UL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.gridList(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: GridListElementBuilder<T>.() -> Unit)
    = child(GridListElementBuilder(gridListComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
