package materialui.components.avatar

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.avatar.enum.AvatarStyle
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Avatar")
private external val avatarModule: dynamic

external interface AvatarProps : StandardProps {
    var imgProps: RProps?
    var alt: String?
    var childrenClassName: String?
    var sizes: String?
    var src: String?
    var srcSet: String?
}

@Suppress("UnsafeCastFromDynamic")
private val avatarComponent: RClass<AvatarProps> = avatarModule.default

fun RBuilder.avatar(vararg classMap: Pair<AvatarStyle, String>, block: AvatarElementBuilder<DIV>.() -> Unit)
    = child(AvatarElementBuilder(avatarComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.avatar(vararg classMap: Pair<AvatarStyle, String>, factory: (TagConsumer<Unit>) -> T, block: AvatarElementBuilder<T>.() -> Unit)
    = child(AvatarElementBuilder(avatarComponent, classMap.toList(), factory).apply(block).create())
