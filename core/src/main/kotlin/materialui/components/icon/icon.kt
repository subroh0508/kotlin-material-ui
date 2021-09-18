package materialui.components.icon

import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Icon
import materialui.components.StandardProps
import materialui.components.icon.enums.IconStyle
import react.*

external interface IconProps : StandardProps {
    var color: String?
    var fontSize: String?
}

fun RBuilder.icon(vararg classMap: Pair<IconStyle, String>, block: IconElementBuilder<SPAN>.() -> Unit) {
    child(IconElementBuilder(Icon, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.icon(vararg classMap: Pair<IconStyle, String>, factory: (TagConsumer<Unit>) -> T, block: IconElementBuilder<T>.() -> Unit) {
    child(IconElementBuilder(Icon, classMap.toList(), factory).apply(block).create())
}