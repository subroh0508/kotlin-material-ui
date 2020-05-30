package materialui.components.expansionpaneldetails

import kotlinx.html.DIV
import materialui.components.MaterialElementBuilder
import react.RClass

class ExpansionPanelDetailsElementBuilder internal constructor(
    type: RClass<ExpansionPanelDetailsProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ExpansionPanelDetailsProps>(type, classMap, { DIV(mapOf(), it) })
