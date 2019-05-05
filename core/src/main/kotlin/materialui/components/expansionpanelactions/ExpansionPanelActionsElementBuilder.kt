package materialui.components.expansionpanelactions

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.expansionpanelactions.enums.ExpansionPanelActionsStyle
import react.RClass

class ExpansionPanelActionsElementBuilder internal constructor(
    type: RClass<ExpansionPanelActionsProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ExpansionPanelActionsProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<ExpansionPanelActionsStyle, String>) {
        classes(classMap.toList())
    }
}