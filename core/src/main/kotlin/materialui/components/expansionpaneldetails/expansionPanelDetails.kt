package materialui.components.expansionpaneldetails

import materialui.ExpansionPanelDetails
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder

external interface ExpansionPanelDetailsProps : StandardProps

fun RBuilder.expansionPanelDetails(rootStyle: String? = null, block: ExpansionPanelDetailsElementBuilder.() -> Unit)
    = child(ExpansionPanelDetailsElementBuilder(ExpansionPanelDetails, listOfNotNull(rootStyle?.let{ MaterialStyle.root to it })).apply(block).create())
