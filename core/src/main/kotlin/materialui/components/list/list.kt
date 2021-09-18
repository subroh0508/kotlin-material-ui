package materialui.components.list

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import materialui.components.StandardProps
import materialui.components.list.enums.ListStyle
import react.RBuilder
import react.ReactElement

external interface ListProps : StandardProps {
    var dense: Boolean?
    var disablePadding: Boolean?
    var subheader: ReactElement?
}

fun RBuilder.list(vararg classMap: Pair<ListStyle, String>, block: ListElementBuilder<UL, ListProps>.() -> Unit) {
    child(ListElementBuilder(materialui.List, classMap.toList()) { UL(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.list(vararg classMap: Pair<ListStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ListElementBuilder<T, ListProps>.() -> Unit) {
    child(ListElementBuilder(materialui.List, classMap.toList(), factory).apply(block).create())
}