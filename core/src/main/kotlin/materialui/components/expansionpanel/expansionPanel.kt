package materialui.components.expansionpanel

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.ExpansionPanel
import materialui.components.expansionpanel.enums.ExpansionPanelStyle
import materialui.components.paper.PaperProps
import org.w3c.dom.events.Event
import react.RBuilder
import react.RProps

external interface ExpansionPanelProps : PaperProps {
    var TransitionProps: PropsWithChildren?
    var defaultExpand: Boolean?
    var disabled: Boolean?
    var expanded: Boolean?
    var onChange: ((Event, Boolean) -> Unit)?
}

fun RBuilder.expansionPanel(vararg classMap: Pair<ExpansionPanelStyle, String>, block: ExpansionPanelElementBuilder<DIV>.() -> Unit)
    = child(ExpansionPanelElementBuilder(ExpansionPanel, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.expansionPanel(vararg classMap: Pair<ExpansionPanelStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ExpansionPanelElementBuilder<T>.() -> Unit)
    = child(ExpansionPanelElementBuilder(ExpansionPanel, classMap.toList(), factory).apply(block).create())
