package materialui.components.dialogcontent

import kotlinx.html.DIV
import materialui.components.MaterialElementBuilder
import react.RClass

class DialogContentElementBuilder internal constructor(
    type: RClass<DialogContentProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, DialogContentProps>(type, classMap, { DIV(mapOf(), it) })