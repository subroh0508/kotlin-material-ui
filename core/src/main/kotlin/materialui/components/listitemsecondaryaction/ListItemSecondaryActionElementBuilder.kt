package materialui.components.listitemsecondaryaction

import kotlinx.html.DIV
import materialui.components.MaterialElementBuilder
import react.RClass

class ListItemSecondaryActionElementBuilder internal constructor(
    type: RClass<ListItemSecondaryActionProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ListItemSecondaryActionProps>(type, classMap, { DIV(mapOf(), it) })