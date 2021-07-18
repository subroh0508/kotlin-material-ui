package materialui.components.dialogcontent

import kotlinx.html.DIV
import materialui.components.MaterialElementBuilder
import react.ComponentType

class DialogContentElementBuilder internal constructor(
    type: ComponentType<DialogContentProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, DialogContentProps>(type, classMap, { DIV(mapOf(), it) })