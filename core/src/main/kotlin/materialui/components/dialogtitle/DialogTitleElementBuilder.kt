package materialui.components.dialogtitle

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class DialogTitleElementBuilder internal constructor(
    type: RClass<DialogTitleProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, DialogTitleProps>(type, classMap, { DIV(mapOf(), it) }) {

    var Tag.disableTypography: Boolean? by materialProps
}