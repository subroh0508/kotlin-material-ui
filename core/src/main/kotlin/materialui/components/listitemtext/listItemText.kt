package materialui.components.listitemtext

import kotlinx.css.Display
import materialui.components.StandardProps
import materialui.components.listitemtext.enums.ListItemTextStyle
import react.*

@JsModule("@material-ui/core/ListItemText")
private external val listItemTextModule: dynamic

external interface ListItemTextProps : StandardProps {
    var disableTypography: Boolean?
    var inset: Boolean?
    var primary: ReactElement?
    var primaryTypographyProps: RProps?
    var secondary: ReactElement?
    var secondaryTypographyProps: RProps?
    var theme: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val listItemTextComponent: RClass<ListItemTextProps> = listItemTextModule.default

fun RBuilder.listItemText(vararg classMap: Pair<ListItemTextStyle, String>, block: ListItemTextElementBuilder.() -> Unit)
    = child(ListItemTextElementBuilder(listItemTextComponent, classMap.toList()).apply(block).create())
