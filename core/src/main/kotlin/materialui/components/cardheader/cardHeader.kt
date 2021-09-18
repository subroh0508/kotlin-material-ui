package materialui.components.cardheader

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.CardHeader
import materialui.components.StandardProps
import materialui.components.cardheader.enums.CardHeaderStyle
import react.RBuilder
import react.PropsWithChildren
import react.ReactElement

external interface CardHeaderProps : StandardProps {
    var action: ReactElement?
    var avatar: ReactElement?
    var disableTypography: Boolean?
    var subheader: ReactElement?
    var subheaderTypographyProps: PropsWithChildren?
    var title: ReactElement?
    var titleTypographyProps: PropsWithChildren?
}

fun RBuilder.cardHeader(vararg classMap: Pair<CardHeaderStyle, String>, block: CardHeaderElementBuilder<DIV>.() -> Unit)
    = child(CardHeaderElementBuilder(CardHeader, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardHeader(vararg classMap: Pair<CardHeaderStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CardHeaderElementBuilder<T>.() -> Unit)
    = child(CardHeaderElementBuilder(CardHeader, classMap.toList(), factory).apply(block).create())
