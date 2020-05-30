package materialui.components.expansionpanelsummary

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.ExpansionPanelSummary
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.expansionpanelsummary.enums.ExpansionPanelSummaryStyle
import react.RBuilder
import react.RProps
import react.ReactElement

external interface ExpansionPanelSummaryProps : ButtonBaseProps {
    var expanded: Boolean?
    var expandIcon: ReactElement?
    var IconButtonProps: RProps?
}

fun RBuilder.expansionPanelSummary(vararg classMap: Pair<ExpansionPanelSummaryStyle, String>, block: ExpansionPanelSummaryElementBuilder<DIV>.() -> Unit)
    = child(ExpansionPanelSummaryElementBuilder(ExpansionPanelSummary, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.expansionPanelSummary(vararg classMap: Pair<ExpansionPanelSummaryStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ExpansionPanelSummaryElementBuilder<T>.() -> Unit)
    = child(ExpansionPanelSummaryElementBuilder(ExpansionPanelSummary, classMap.toList(), factory).apply(block).create())
