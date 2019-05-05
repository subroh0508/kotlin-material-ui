package materialui.components.listitemicon

import kotlinx.html.DIV
import materialui.components.MMaterialElementBuilder
import react.RClass

class ListItemIconElementBuilder internal constructor(
    type: RClass<ListItemIconProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MMaterialElementBuilder<DIV, ListItemIconProps>(type, classMap, { DIV(mapOf(), it) })