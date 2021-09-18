package materialui.components.dialogtitle

import materialui.DialogTitle
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder

external interface DialogTitleProps : StandardProps {
    var disableTypography: Boolean?
}

fun RBuilder.dialogTitle(rootStyle: String? = null, block: DialogTitleElementBuilder.() -> Unit) {
    child(DialogTitleElementBuilder(DialogTitle, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })).apply(block).create())
}