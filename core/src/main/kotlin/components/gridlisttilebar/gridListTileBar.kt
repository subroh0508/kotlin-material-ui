package components.gridlisttilebar

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/GridListTileBar")
private external val gridListTileBarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val gridListTileBarComponent: RComponent<RProps, RState> = gridListTileBarModule.default

fun RBuilder.gridListTileBar(block: GridListTileBarElementBuilder.() -> Unit)
    = child(GridListTileBarElementBuilder(gridListTileBarComponent).apply(block).create())
