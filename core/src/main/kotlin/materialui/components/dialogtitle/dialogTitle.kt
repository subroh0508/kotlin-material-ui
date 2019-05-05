package materialui.components.dialogtitle

import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/DialogTitle")
private external val dialogTitleModule: dynamic

external interface DialogTitleProps : StandardProps {
    var disableTypography: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val dialogTitleComponent: RClass<DialogTitleProps> = dialogTitleModule.default

fun RBuilder.dialogTitle(rootStyle: String? = null, block: DialogTitleElementBuilder.() -> Unit)
    = child(DialogTitleElementBuilder(dialogTitleComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })).apply(block).create())
