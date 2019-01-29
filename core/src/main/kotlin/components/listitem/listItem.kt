package components.listitem

import kotlinx.html.DIV
import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.attributesMapOf
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/ListItem")
private external val listItemModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listItemComponent: RComponent<RProps, RState> = listItemModule.default

fun RBuilder.listItem(block: ListItemElementBuilder<LI>.() -> Unit)
    = child(ListItemElementBuilder(listItemComponent, LI::class) { LI(attributesMapOf("button", "false"), it) }.apply(block).create())

fun RBuilder.listItem(block: ListItemElementBuilder<DIV>.() -> Unit)
    = child(ListItemElementBuilder(listItemComponent, DIV::class) { DIV(attributesMapOf("button", "true"), it) }.apply(block).create())

fun <T: Tag> RBuilder.listItem(tag: KClass<T>, block: ListItemElementBuilder<T>.() -> Unit)
    = child(ListItemElementBuilder(listItemComponent, tag).apply(block).create())