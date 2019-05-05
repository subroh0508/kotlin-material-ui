package materialui.components.fab

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.fab.enums.FabStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Fab")
private external val fabModule: dynamic

external interface FabProps : ButtonBaseProps {
    var color: String?
    var href: String?
    var size: String?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val fabComponent: RClass<FabProps> = fabModule.default

fun RBuilder.fab(vararg classMap: Pair<FabStyle, String>, block: FabElementBuilder<BUTTON>.() -> Unit)
    = child(FabElementBuilder(fabComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.fab(vararg classMap: Pair<FabStyle, String>, factory: (TagConsumer<Unit>) -> T, block: FabElementBuilder<T>.() -> Unit)
    = child(FabElementBuilder(fabComponent, classMap.toList(), factory).apply(block).create())
