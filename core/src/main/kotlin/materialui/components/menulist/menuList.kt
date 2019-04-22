package materialui.components.menulist

import kotlinx.html.Tag
import kotlinx.html.UL
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/MenuList")
private external val menuListModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val menuListComponent: RComponent<RProps, RState> = menuListModule.default

fun RBuilder.menuList(block: MenuListElementBuilder<UL>.() -> Unit)
    = child(MenuListElementBuilder(menuListComponent, UL::class) { UL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.menuList(tag: KClass<T>, block: MenuListElementBuilder<T>.() -> Unit)
    = child(MenuListElementBuilder(menuListComponent, tag).apply(block).create())
