package components.iconbutton

import components.button.enums.ButtonColor
import components.buttonbase.ButtonBaseElementBuilder
import components.consumers
import components.iconbutton.enums.IconButtonStyle
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

    fun Tag.classes(vararg classMap: Pair<IconButtonStyle, String>) {
        setClasses(classMap.map { it.first.toString() to it.second })
    }
    var Tag.color: ButtonColor
        get() = ButtonColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
}