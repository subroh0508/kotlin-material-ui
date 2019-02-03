package components.listitemavatar

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/ListAvatar")
private external val listAvatarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listAvatarComponent: RComponent<RProps, RState> = listAvatarModule.default

fun RBuilder.listAvatar(block: ListItemAvatarElementBuilder.() -> Unit)
    = child(ListItemAvatarElementBuilder(listAvatarComponent).apply(block).create())
