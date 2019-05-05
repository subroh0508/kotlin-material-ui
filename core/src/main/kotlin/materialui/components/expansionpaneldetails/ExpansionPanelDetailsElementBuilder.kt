package materialui.components.expansionpaneldetails

import kotlinx.html.DIV
import materialui.components.MaterialElementBuilder
import react.RClass

class ExpansionPanelDetailsElementBuilder internal constructor(
    type: RClass<ExpansionPanelDetailProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ExpansionPanelDetailProps>(type, classMap, { DIV(mapOf(), it) })