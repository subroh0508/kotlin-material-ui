package materialui.components.dialogactions

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MMaterialElementBuilder
import materialui.components.dialogactions.enums.DialogActionsStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class DialogActionsElementBuilder internal constructor(
    type: RClass<DialogActionProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MMaterialElementBuilder<DIV, DialogActionProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<DialogActionsStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disableActionSpacing: Boolean? by materialProps
}