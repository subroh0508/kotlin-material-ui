package materialui.components.divider

import kotlinx.html.HR
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Divider
import materialui.components.StandardProps
import materialui.components.divider.enums.DividerStyle
import react.RBuilder

external interface DividerProps : StandardProps {
    var absolute: Boolean?
    var light: Boolean?
    var variant: String?
    var orientation: String?
    var flexItem: Boolean?
}

fun RBuilder.divider(vararg classMap: Pair<DividerStyle, String>, block: DividerElementBuilder<HR>.() -> Unit) =
    child(DividerElementBuilder(Divider, classMap.toList()) { HR(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.divider(
    vararg classMap: Pair<DividerStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: DividerElementBuilder<T>.() -> Unit
) = child(DividerElementBuilder(Divider, classMap.toList(), factory).apply(block).create())
