package materialui.components.grid

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.grid.enums.GridStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Grid")
private external val gridModule: dynamic

external interface GridProps : StandardProps {
    var alignContent: String?
    var alignItems: String?
    var container: Boolean?
    var direction: String?
    var item: Boolean?
    var justify: String?
    var lg: Any?
    var md: Any?
    var sm: Any?
    var spacing: Int?
    var wrap: String?
    var xl: Any?
    var xs: Any?
    var zeroMinWidth: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val gridComponent: RClass<GridProps> = gridModule.default

fun RBuilder.grid(vararg classMap: Pair<GridStyle, String>, block: GridElementBuilder<DIV>.() -> Unit)
    = child(GridElementBuilder(gridComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.grid(vararg classMap: Pair<GridStyle, String>, factory: (TagConsumer<Unit>) -> T, block: GridElementBuilder<T>.() -> Unit)
    = child(GridElementBuilder(gridComponent, classMap.toList(), factory).apply(block).create())
