package components.expansionpanelactions

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/ExpansionPanelActions")
private external val expansionPanelActionsModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val expansionPanelActionsComponent: RComponent<RProps, RState> = expansionPanelActionsModule.default

fun RBuilder.expansionPanelActions(block: ExpansionPanelActionsElementBuilder.() -> Unit)
    = child(ExpansionPanelActionsElementBuilder(expansionPanelActionsComponent).apply(block).create())
