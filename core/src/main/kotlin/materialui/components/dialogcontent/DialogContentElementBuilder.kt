package materialui.components.dialogcontent

import kotlinx.html.DIV
import materialui.components.MMaterialElementBuilder
import react.RClass

class DialogContentElementBuilder internal constructor(
    type: RClass<DialogContentProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MMaterialElementBuilder<DIV, DialogContentProps>(type, classMap, { DIV(mapOf(), it) })