package materialui.components.cardactions

import materialui.components.StandardProps
import materialui.components.cardactions.enums.CardActionsStyle
import react.*

@JsModule("@material-ui/core/CardActions")
private external val cardActionsModule: dynamic

external interface CardActionsProps : StandardProps {
    var disableActionSpacing: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val cardActionsComponent: RClass<CardActionsProps> = cardActionsModule.default

fun RBuilder.cardActions(vararg classMap: Pair<CardActionsStyle, String>, block: CardActionsElementBuilder.() -> Unit)
    = child(CardActionsElementBuilder(cardActionsComponent, classMap.toList()).apply(block).create())
