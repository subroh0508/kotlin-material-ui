package materialui.components.avatar

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Avatar
import materialui.components.StandardProps
import materialui.components.avatar.enum.AvatarStyle
import react.RBuilder
import react.RProps

external interface AvatarProps : StandardProps {
    var imgProps: PropsWithChildren?
    var alt: String?
    var childrenClassName: String?
    var sizes: String?
    var src: String?
    var srcSet: String?
}

fun RBuilder.avatar(vararg classMap: Pair<AvatarStyle, String>, block: AvatarElementBuilder<DIV>.() -> Unit)
    = child(AvatarElementBuilder(Avatar, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.avatar(vararg classMap: Pair<AvatarStyle, String>, factory: (TagConsumer<Unit>) -> T, block: AvatarElementBuilder<T>.() -> Unit)
    = child(AvatarElementBuilder(Avatar, classMap.toList(), factory).apply(block).create())
