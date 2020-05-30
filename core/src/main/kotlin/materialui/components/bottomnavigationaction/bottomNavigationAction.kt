package materialui.components.bottomnavigationaction

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.BottomNavigationAction
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.buttonbase.enums.ButtonBaseStyle
import react.RBuilder
import react.ReactElement

external interface BottomNavigationActionProps : ButtonBaseProps {
    var icon: ReactElement?
    var label: ReactElement?
    var selected: Boolean?
    var showLabel: Boolean?
    var value: Any?
}

fun RBuilder.bottomNavigationAction(vararg classMap: Pair<ButtonBaseStyle, String>, block: BottomNavigationActionElementBuilder<BUTTON>.() -> Unit)
    = child(BottomNavigationActionElementBuilder(BottomNavigationAction, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.bottomNavigationAction(vararg classMap: Pair<ButtonBaseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: BottomNavigationActionElementBuilder<T>.() -> Unit)
    = child(BottomNavigationActionElementBuilder(BottomNavigationAction, classMap.toList(), factory).apply(block).create())
