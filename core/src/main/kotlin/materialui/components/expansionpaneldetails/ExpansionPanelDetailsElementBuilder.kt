package materialui.components.expansionpaneldetails

import kotlinx.html.DIV
import materialui.components.MMaterialElementBuilder
import react.RClass

class ExpansionPanelDetailsElementBuilder internal constructor(
    type: RClass<ExpansionPanelDetailProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MMaterialElementBuilder<DIV, ExpansionPanelDetailProps>(type, classMap, { DIV(mapOf(), it) })