package materialui.components.alert

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.alert.enums.AlertVariant
import materialui.components.appbar.enums.AlertSeverity
import materialui.components.appbar.enums.AlertStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/lab/Alert")
private external val alertModule: dynamic

external interface AlertProps : StandardProps {
    var severity: AlertSeverity?
    var variant: AlertVariant?
}

@Suppress("UnsafeCastFromDynamic")
private val alertComponent: RClass<AlertProps> = alertModule.default

fun RBuilder.appBar(vararg classMap: Pair<AlertStyle, String>, block: AlertElementBuilder<DIV>.() -> Unit) =
    child(AlertElementBuilder(alertComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.appBar(
    vararg classMap: Pair<AlertStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: AlertElementBuilder<T>.() -> Unit
) = child(AlertElementBuilder(alertComponent, classMap.toList(), factory).apply(block).create())
