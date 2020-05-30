package materialui.components.tabs

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Tabs
import materialui.components.StandardProps
import materialui.components.tabs.enums.TabsStyle
import materialui.styles.muitheme.MuiTheme
import org.w3c.dom.events.Event
import react.RBuilder
import react.RProps

external interface TabsProps : StandardProps {
    var action: ((TabsActions) -> Unit)?
    var centered: Boolean?
    @Deprecated("Instead, use the `variant=\"fullWidth\"` property.")
    var fullWidth: Boolean?
    var indicatorColor: String?
    var onChange: ((Event, Int) -> Unit)?
    @Deprecated("Instead, use the `variant=\"scrollable\"` property.")
    var scrollable: Boolean?
    var ScrollButtonComponent: dynamic
    var scrollButtons: String?
    var TabIndicatorProps: RProps?
    var textColor: String?
    var theme: MuiTheme?
    var value: Any?
    var variant: String?
}

external interface TabsActions {
    val updateIndicator: () -> Unit
}

fun RBuilder.tabs(vararg classMap: Pair<TabsStyle, String>, block: TabsElementBuilder<DIV>.() -> Unit)
    = child(TabsElementBuilder(Tabs, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tabs(vararg classMap: Pair<TabsStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TabsElementBuilder<T>.() -> Unit)
    = child(TabsElementBuilder(Tabs, classMap.toList(), factory).apply(block).create())
