package materialui.components.expansionpanel

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/ExpansionPanel")
private external val expansionPanelModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val expansionPanelComponent: RComponent<RProps, RState> = expansionPanelModule.default

fun RBuilder.expansionPanel(block: ExpansionPanelElementBuilder<DIV>.() -> Unit)
    = child(ExpansionPanelElementBuilder(expansionPanelComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.expansionPanel(tag: KClass<T>, block: ExpansionPanelElementBuilder<T>.() -> Unit)
    = child(ExpansionPanelElementBuilder(expansionPanelComponent, tag).apply(block).create())
