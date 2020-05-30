package materialui.components.cardactions

import materialui.CardActions
import materialui.components.StandardProps
import materialui.components.cardactions.enums.CardActionsStyle
import react.*

external interface CardActionsProps : StandardProps {
    var disableSpacing: Boolean?
}

fun RBuilder.cardActions(vararg classMap: Pair<CardActionsStyle, String>, block: CardActionsElementBuilder.() -> Unit)
    = child(CardActionsElementBuilder(CardActions, classMap.toList()).apply(block).create())
