package materialui.components.cardheader

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.cardheader.enums.CardHeaderStyle
import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement

@JsModule("@material-ui/core/CardHeader")
private external val cardHeaderModule: dynamic

external interface CardHeaderProps : StandardProps {
    var action: ReactElement?
    var avatar: ReactElement?
    var disableTypography: Boolean?
    var subheader: ReactElement?
    var subheaderTypographyProps: RProps?
    var title: ReactElement?
    var titleTypographyProps: RProps?
}

@Suppress("UnsafeCastFromDynamic")
private val cardHeaderComponent: RClass<CardHeaderProps> = cardHeaderModule.default

fun RBuilder.cardHeader(vararg classMap: Pair<CardHeaderStyle, String>, block: CardHeaderElementBuilder<DIV>.() -> Unit)
    = child(CardHeaderElementBuilder(cardHeaderComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardHeader(vararg classMap: Pair<CardHeaderStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CardHeaderElementBuilder<T>.() -> Unit)
    = child(CardHeaderElementBuilder(cardHeaderComponent, classMap.toList(), factory).apply(block).create())