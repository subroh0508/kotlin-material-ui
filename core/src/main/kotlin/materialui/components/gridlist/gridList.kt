package materialui.components.gridlist

import kotlinx.html.Tag
import kotlinx.html.UL
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/GridList")
private external val gridListModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val gridListComponent: RComponent<RProps, RState> = gridListModule.default

fun RBuilder.gridList(block: GridListElementBuilder<UL>.() -> Unit)
    = child(GridListElementBuilder(gridListComponent, UL::class) { UL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.gridList(tag: KClass<T>, block: GridListElementBuilder<T>.() -> Unit)
    = child(GridListElementBuilder(gridListComponent, tag).apply(block).create())
