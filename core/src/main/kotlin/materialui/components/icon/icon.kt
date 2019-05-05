package materialui.components.icon

import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.icon.enums.IconStyle
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Icon")
private external val iconModule: dynamic

external interface IconProps : StandardProps {
    var color: String?
    var fontSize: String?
}

@Suppress("UnsafeCastFromDynamic")
private val iconComponent: RClass<IconProps> = iconModule.default

fun RBuilder.icon(vararg classMap: Pair<IconStyle, String>, block: IconElementBuilder<SPAN>.() -> Unit)
    = child(IconElementBuilder(iconComponent, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.icon(vararg classMap: Pair<IconStyle, String>, factory: (TagConsumer<Unit>) -> T, block: IconElementBuilder<T>.() -> Unit)
    = child(IconElementBuilder(iconComponent, classMap.toList(), factory).apply(block).create())
