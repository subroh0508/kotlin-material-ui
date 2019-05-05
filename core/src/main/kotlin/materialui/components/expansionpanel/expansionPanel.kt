package materialui.components.expansionpanel

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.expansionpanel.enums.ExpansionPanelStyle
import materialui.components.paper.PaperProps
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/ExpansionPanel")
private external val expansionPanelModule: dynamic

external interface ExpansionPanelProps : PaperProps {
    // todo replace TransitionComponent: dynamic/TransitionProps: RProps
    var CollapseProps: RProps?
    var defaultExpand: Boolean?
    var disabled: Boolean?
    var expanded: Boolean?
    var onChange: ((Event, Boolean) -> Unit)?
}

@Suppress("UnsafeCastFromDynamic")
private val expansionPanelComponent: RClass<ExpansionPanelProps> = expansionPanelModule.default

fun RBuilder.expansionPanel(vararg classMap: Pair<ExpansionPanelStyle, String>, block: ExpansionPanelElementBuilder<DIV>.() -> Unit)
    = child(ExpansionPanelElementBuilder(expansionPanelComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.expansionPanel(vararg classMap: Pair<ExpansionPanelStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ExpansionPanelElementBuilder<T>.() -> Unit)
    = child(ExpansionPanelElementBuilder(expansionPanelComponent, classMap.toList(), factory).apply(block).create())
