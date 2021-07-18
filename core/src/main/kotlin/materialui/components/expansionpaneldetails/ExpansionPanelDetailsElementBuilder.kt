package materialui.components.expansionpaneldetails

import kotlinx.html.DIV
import materialui.components.MaterialElementBuilder
import react.ComponentType

class ExpansionPanelDetailsElementBuilder internal constructor(
    type: ComponentType<ExpansionPanelDetailsProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ExpansionPanelDetailsProps>(type, classMap, { DIV(mapOf(), it) })
