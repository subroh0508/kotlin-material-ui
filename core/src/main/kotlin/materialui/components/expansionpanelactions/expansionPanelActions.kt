package materialui.components.expansionpanelactions

import materialui.ExpansionPanelActions
import materialui.components.StandardProps
import materialui.components.expansionpanelactions.enums.ExpansionPanelActionsStyle
import react.*

external interface ExpansionPanelActionsProps : StandardProps

fun RBuilder.expansionPanelActions(vararg classMap: Pair<ExpansionPanelActionsStyle, String>, block: ExpansionPanelActionsElementBuilder.() -> Unit)
    = child(ExpansionPanelActionsElementBuilder(ExpansionPanelActions, classMap.toList()).apply(block).create())
