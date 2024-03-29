package materialui.components.cardactions

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.cardactions.enums.CardActionsStyle
import materialui.components.getValue
import materialui.components.setValue
import react.ComponentType

class CardActionsElementBuilder internal constructor(
    type: ComponentType<CardActionsProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, CardActionsProps>(type, classMap.toList(), { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<CardActionsStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.disableSpacing: Boolean? by materialProps
}
