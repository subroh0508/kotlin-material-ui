package materialui.components.badge

import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Badge
import materialui.components.StandardProps
import materialui.components.badge.enums.BadgeColor
import materialui.components.badge.enums.BadgeStyle
import materialui.components.badge.enums.BadgeVariant
import react.RBuilder
import react.ReactElement

external interface BadgeProps : StandardProps {
    var badgeContent: ReactElement?
    var color: BadgeColor?
    var invisible: Boolean?
    var max: Number?
    var showZero: Boolean?
    var variant: BadgeVariant?
}

fun RBuilder.badge(vararg classMap: Pair<BadgeStyle, String>, block: BadgeElementBuilder<SPAN>.() -> Unit) {
    child(BadgeElementBuilder(Badge, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.badge(vararg classMap: Pair<BadgeStyle, String>, factory: (TagConsumer<Unit>) -> T, block: BadgeElementBuilder<T>.() -> Unit) {
    child(BadgeElementBuilder(Badge, classMap.toList(), factory).apply(block).create())
}