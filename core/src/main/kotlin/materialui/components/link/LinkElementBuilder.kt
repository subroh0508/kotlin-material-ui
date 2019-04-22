package materialui.components.link

import materialui.components.consumers
import materialui.components.link.enums.LinkUnderline
import materialui.components.typography.TypographyElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class LinkElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : TypographyElementBuilder<T>(type, tag, factory) {

    var Tag.block: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["block"]
        set(value) { setProp("block", value) }
    var Tag.TypographyClasses: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TypographyClasses"]
        set(value) { setProp("TypographyClasses", value) }
    var Tag.underline: LinkUnderline
        get() = LinkUnderline.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["underline"])
        set(value) { setProp("underline", value.toString()) }
}