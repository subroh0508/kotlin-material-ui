package materialui.lab.components.alert

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.lab.components.alert.enums.AlertStyle
import materialui.components.paper.PaperProps
import org.w3c.dom.Node
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass

@JsModule("@material-ui/lab/Alert")
@JsNonModule
private external val alertModule: dynamic

external interface AlertProps : PaperProps {
    var action: dynamic
    var closeText: String
    var color: String?
    var icon: dynamic
    var iconMapping: AlertIconMapping
    var onClose: ((event: Event) -> Unit)?
    var role: String
    var severity: String
    var variant: String
}

external interface AlertIconMapping {
    var error: Node?
    var info: Node?
    var success: Node?
    var warning: Node?
}

@Suppress("UnsafeCastFromDynamic")
private val alertComponent: RClass<AlertProps> = alertModule.default

fun RBuilder.alert(vararg classMap: Pair<AlertStyle, String>, block: AlertElementBuilder<DIV>.() -> Unit)
        = child(AlertElementBuilder(alertComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.alert(vararg classMap: Pair<AlertStyle, String>, factory: (TagConsumer<Unit>) -> T, block: AlertElementBuilder<T>.() -> Unit)
        = child(AlertElementBuilder(alertComponent, classMap.toList(), factory).apply(block).create())
