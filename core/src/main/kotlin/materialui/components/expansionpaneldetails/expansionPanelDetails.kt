package materialui.components.expansionpaneldetails

import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/ExpansionPanelDetails")
private external val expansionPanelDetailsModule: dynamic

external interface ExpansionPanelDetailProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val expansionPanelDetailsComponent: RClass<ExpansionPanelDetailProps> = expansionPanelDetailsModule.default

fun RBuilder.expansionPanelDetails(rootStyle: String? = null, block: ExpansionPanelDetailsElementBuilder.() -> Unit)
    = child(ExpansionPanelDetailsElementBuilder(expansionPanelDetailsComponent, listOfNotNull(rootStyle?.let{ MaterialStyle.root to it })).apply(block).create())
