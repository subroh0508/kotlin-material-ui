package materialui.components.container

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.container.enums.ContainerMaxWidth
import materialui.components.container.enums.ContainerStyle
import materialui.components.expansionpanel.ExpansionPanelElementBuilder
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Container")
private external val containerModule: dynamic

external interface ContainerProps : StandardProps {
    var disableGutters: Boolean?
    var fixed: Boolean?
    var maxWidth: ContainerMaxWidth?
}

@Suppress("UnsafeCastFromDynamic")
private val containerComponent: RClass<ContainerProps> = containerModule.default

fun RBuilder.container(vararg classMap: Pair<ContainerStyle, String>, block: ContainerElementBuilder<DIV>.() -> Unit) =
    child(ContainerElementBuilder(containerComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.container(vararg classMap: Pair<ContainerStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ContainerElementBuilder<T>.() -> Unit) =
    child(ContainerElementBuilder(containerComponent, classMap.toList(), factory).apply(block).create())

inline fun RBuilder.fixedContainer(vararg classMap: Pair<ContainerStyle, String>, crossinline block: ContainerElementBuilder<DIV>.() -> Unit) =
    container(*classMap) { attrs.fixed = true; block() }
