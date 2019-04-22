package materialui.components.expansionpanelsummary

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/ExpansionPanelSummary")
private external val expansionPanelSummaryModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val expansionPanelSummaryComponent: RComponent<RProps, RState> = expansionPanelSummaryModule.default

fun RBuilder.expansionPanelSummary(block: ExpansionPanelSummaryElementBuilder<BUTTON>.() -> Unit)
    = child(ExpansionPanelSummaryElementBuilder(expansionPanelSummaryComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.expansionPanelSummary(tag: KClass<T>, block: ExpansionPanelSummaryElementBuilder<T>.() -> Unit)
    = child(ExpansionPanelSummaryElementBuilder(expansionPanelSummaryComponent, tag).apply(block).create())
