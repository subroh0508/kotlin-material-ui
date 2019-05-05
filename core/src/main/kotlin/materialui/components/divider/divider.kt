package materialui.components.divider

import kotlinx.html.HR
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.divider.enums.DividerStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Divider")
private external val dividerModule: dynamic

external interface DividerProps : StandardProps {
    var absolute: Boolean?
    var inset: Boolean?
    var light: Boolean?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val dividerComponent: RClass<DividerProps> = dividerModule.default

fun RBuilder.divider(vararg classMap: Pair<DividerStyle, String>, block: DividerElementBuilder<HR>.() -> Unit)
    = child(DividerElementBuilder(dividerComponent, classMap.toList()) { HR(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.divider(vararg classMap: Pair<DividerStyle, String>, factory: (TagConsumer<Unit>) -> T, block: DividerElementBuilder<T>.() -> Unit)
    = child(DividerElementBuilder(dividerComponent, classMap.toList(), factory).apply(block).create())
