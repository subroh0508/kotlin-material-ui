package materialui.components.link

import kotlinx.html.A
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Link
import materialui.components.link.enums.LinkStyle
import materialui.components.typography.TypographyProps
import react.RBuilder

external interface LinkProps : TypographyProps {
    var block: Boolean?
    var TypographyClasses: dynamic
    var underline: String?
}

fun RBuilder.link(vararg classMap: Pair<LinkStyle, String>, block: LinkElementBuilder<A>.() -> Unit)
    = child(LinkElementBuilder(Link, classMap.toList()) { A(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.link(vararg classMap: Pair<LinkStyle, String>, factory: (TagConsumer<Unit>) -> T, block: LinkElementBuilder<T>.() -> Unit)
    = child(LinkElementBuilder(Link, classMap.toList(), factory).apply(block).create())
