package materialui.components.list

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import materialui.components.StandardProps
import materialui.components.list.enums.ListStyle
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/List")
private external val listModule: dynamic

external interface ListProps : StandardProps {
    var dense: Boolean?
    var disablePadding: Boolean?
    var subheader: ReactElement?
}

@Suppress("UnsafeCastFromDynamic")
private val listComponent: RClass<ListProps> = listModule.default

fun RBuilder.list(vararg classMap: Pair<ListStyle, String>, block: ListElementBuilder<UL, ListProps>.() -> Unit)
    = child(ListElementBuilder(listComponent, classMap.toList()) { UL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.list(vararg classMap: Pair<ListStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ListElementBuilder<T, ListProps>.() -> Unit)
    = child(ListElementBuilder(listComponent, classMap.toList(), factory).apply(block).create())