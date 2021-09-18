package materialui.components.tab

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Tab
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.tab.enums.TabStyle
import react.RBuilder
import react.ReactElement

external interface TabProps : ButtonBaseProps {
    var icon: ReactElement?
    var indicator: ReactElement?
    var label: ReactElement?
    var selected: Boolean?
    var textColor: String?
    var value: Any?
}

fun RBuilder.tab(vararg classMap: Pair<TabStyle, String>, block: TabElementBuilder<BUTTON>.() -> Unit) {
    child(TabElementBuilder(Tab, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.tab(vararg classMap: Pair<TabStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TabElementBuilder<T>.() -> Unit) {
    child(TabElementBuilder(Tab, classMap.toList(), factory).apply(block).create())
}