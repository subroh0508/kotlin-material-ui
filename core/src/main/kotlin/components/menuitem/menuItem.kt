package components.menuitem

import kotlinx.html.LI
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/MenuItem")
private external val menuItemModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val menuItemComponent: RComponent<RProps, RState> = menuItemModule.default

fun RBuilder.menuItem(block: MenuItemElementBuilder<LI>.() -> Unit)
    = child(MenuItemElementBuilder(menuItemComponent, LI::class) { LI(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.menuItem(tag: KClass<T>, block: MenuItemElementBuilder<T>.() -> Unit)
    = child(MenuItemElementBuilder(menuItemComponent, tag).apply(block).create())
