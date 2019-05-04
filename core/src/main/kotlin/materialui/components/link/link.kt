package materialui.components.link

import kotlinx.html.P
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.link.enums.LinkStyle
import materialui.components.typography.TypographyProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Link")
private external val linkModule: dynamic

external interface LinkProps : TypographyProps {
    var block: Boolean?
    var TypographyClasses: dynamic
    var underline: String?
}

@Suppress("UnsafeCastFromDynamic")
private val linkComponent: RClass<LinkProps> = linkModule.default

fun RBuilder.link(vararg classMap: Pair<LinkStyle, String>, block: LinkElementBuilder<P>.() -> Unit)
    = child(LinkElementBuilder(linkComponent, classMap.toList()) { P(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.link(vararg classMap: Pair<LinkStyle, String>, factory: (TagConsumer<Unit>) -> T, block: LinkElementBuilder<T>.() -> Unit)
    = child(LinkElementBuilder(linkComponent, classMap.toList(), factory).apply(block).create())
