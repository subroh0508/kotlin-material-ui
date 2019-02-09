package components.iconbutton

import components.MaterialElementStyles
import components.button.enums.ButtonColor
import components.buttonbase.ButtonBaseElementBuilder
import components.consumers
import components.iconbutton.enums.IconButtonStyle
import kotlinx.css.CSSBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class IconButtonElementBuilder<T: Tag>(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ButtonBaseElementBuilder<T>(type, tag, factory) {

    var Tag.color: ButtonColor
        get() = ButtonColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }

    fun MaterialElementStyles.styles(attrName: IconButtonStyle, handler: CSSBuilder.() -> Unit) {
        this[attrName.toString()] = CSSBuilder().apply(handler).toDynamic
    }
}