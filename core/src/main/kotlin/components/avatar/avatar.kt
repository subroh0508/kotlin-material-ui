package components.avatar

import kotlinx.html.DIV
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Avatar")
private external val avatarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val avatarComponent: RComponent<RProps, RState> = avatarModule.default

fun RBuilder.avatar(block: AvatarElementBuilder<DIV>.() -> Unit)
    = child(AvatarElementBuilder(avatarComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())
