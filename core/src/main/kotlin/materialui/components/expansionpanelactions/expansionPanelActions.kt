package materialui.components.expansionpanelactions

import materialui.components.StandardProps
import materialui.components.expansionpanelactions.enums.ExpansionPanelActionsStyle
import react.*

@JsModule("@material-ui/core/ExpansionPanelActions")
private external val expansionPanelActionsModule: dynamic

external interface ExpansionPanelActionsProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val expansionPanelActionsComponent: RClass<ExpansionPanelActionsProps> = expansionPanelActionsModule.default

fun RBuilder.expansionPanelActions(vararg classMap: Pair<ExpansionPanelActionsStyle, String>, block: ExpansionPanelActionsElementBuilder.() -> Unit)
    = child(ExpansionPanelActionsElementBuilder(expansionPanelActionsComponent, classMap.toList()).apply(block).create())
