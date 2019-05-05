package materialui.components.listitemsecondaryaction

import kotlinx.html.DIV
import materialui.components.MMaterialElementBuilder
import react.RClass

class ListItemSecondaryActionElementBuilder internal constructor(
    type: RClass<ListItemSecondaryActionProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MMaterialElementBuilder<DIV, ListItemSecondaryActionProps>(type, classMap, { DIV(mapOf(), it) })