package materialui.components.listitemtext

import materialui.ListItemText
import materialui.components.StandardProps
import materialui.components.listitemtext.enums.ListItemTextStyle
import react.*

external interface ListItemTextProps : StandardProps {
    var disableTypography: Boolean?
    var inset: Boolean?
    var primary: ReactElement?
    var primaryTypographyProps: PropsWithChildren?
    var secondary: ReactElement?
    var secondaryTypographyProps: PropsWithChildren?
    var theme: Any?
}

fun RBuilder.listItemText(vararg classMap: Pair<ListItemTextStyle, String>, block: ListItemTextElementBuilder.() -> Unit) {
    child(ListItemTextElementBuilder(ListItemText, classMap.toList()).apply(block).create())
}