package materialui.components.expansionpaneldetails

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/ExpansionPanelDetails")
private external val expansionPanelDetailsModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val expansionPanelDetailsComponent: RComponent<RProps, RState> = expansionPanelDetailsModule.default

fun RBuilder.expansionPanelDetails(block: ExpansionPanelDetailsElementBuilder.() -> Unit)
    = child(ExpansionPanelDetailsElementBuilder(expansionPanelDetailsComponent).apply(block).create())
