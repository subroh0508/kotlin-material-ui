package materialui.components.cardactions

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/CardActions")
private external val cardActionsModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cardActionsComponent: RComponent<RProps, RState> = cardActionsModule.default

fun RBuilder.cardActions(block: CardActionsElementBuilder.() -> Unit)
    = child(CardActionsElementBuilder(cardActionsComponent).apply(block).create())
