package materialui.components.listitemicon

import kotlinx.html.DIV
import materialui.components.MaterialElementBuilder
import react.ComponentType

class ListItemIconElementBuilder internal constructor(
    type: ComponentType<ListItemIconProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ListItemIconProps>(type, classMap, { DIV(mapOf(), it) })