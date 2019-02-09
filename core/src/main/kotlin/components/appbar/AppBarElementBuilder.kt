package components.appbar

import components.MaterialElementStyles
import components.appbar.enums.AppBarColor
import components.appbar.enums.AppBarPosition
import components.appbar.enums.AppBarStyle
import components.consumers
import components.paper.PaperElementBuilder
import kotlinx.css.CSSBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class AppBarElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : PaperElementBuilder<T>(type, tag, factory) {

    var Tag.color: AppBarColor
        get() = AppBarColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.position: AppBarPosition
        get() = AppBarPosition.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["position"])
        set(value) { setProp("position", value.toString()) }

    fun MaterialElementStyles.styles(attrName: AppBarStyle, handler: CSSBuilder.() -> Unit) {
        this[attrName.toString()] = CSSBuilder().apply(handler).toDynamic
    }
}