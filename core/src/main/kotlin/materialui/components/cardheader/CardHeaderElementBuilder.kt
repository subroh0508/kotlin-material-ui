package materialui.components.cardheader

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class CardHeaderElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.action: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["action"]
        set(value) { setProp("action", value) }
    var Tag.avatar: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["avatar"]
        set(value) { setProp("avatar", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.disableTypography: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableTypography"]
        set(value) { setProp("disableTypography", value) }
    var Tag.subheader: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["subheader"]
        set(value) { setProp("subheader", value) }
    var Tag.subheaderTypographyProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["subheaderTypographyProps"]
        set(value) { setProp("subheaderTypographyProps", value) }
    var Tag.title: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["title"]
        set(value) { setProp("title", value) }
    var Tag.titleTypographyProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["titleTypographyProps"]
        set(value) { setProp("titleTypographyProps", value) }
}