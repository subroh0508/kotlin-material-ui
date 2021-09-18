package materialui.components.listsubheader

import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.ListSubheader
import materialui.components.StandardProps
import materialui.components.listsubheader.enums.ListSubheaderStyle
import react.RBuilder

external interface ListSubheaderProps : StandardProps {
    var color: String?
    var disableGutters: Boolean?
    var disableSticky: Boolean?
    var inset: Boolean?
}

fun RBuilder.listSubheader(vararg classMap: Pair<ListSubheaderStyle, String>, block: ListSubheaderElementBuilder<LI>.() -> Unit) {
    child(ListSubheaderElementBuilder(ListSubheader, classMap.toList()) { LI(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.listSubheader(vararg classMap: Pair<ListSubheaderStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ListSubheaderElementBuilder<T>.() -> Unit)
        = child(ListSubheaderElementBuilder(ListSubheader, classMap.toList(), factory).apply(block).create())
