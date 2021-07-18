package materialui.components.listitemsecondaryaction

import kotlinx.html.DIV
import materialui.components.MaterialElementBuilder
import react.ComponentType

class ListItemSecondaryActionElementBuilder internal constructor(
    type: ComponentType<ListItemSecondaryActionProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ListItemSecondaryActionProps>(type, classMap, { DIV(mapOf(), it) })