package materialui.components.buttonbase

import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.buttonbase.enums.ButtonBaseStyle
import materialui.components.buttonbase.enums.ButtonStyle
import materialui.components.getValue
import materialui.components.setValue
import org.w3c.dom.events.Event
import react.ComponentType
import react.PropsWithChildren
import react.Ref

open class ButtonBaseElementBuilder<T: Tag, Props: ButtonBaseProps>(
    type: ComponentType<Props>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, Props>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ButtonBaseStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.buttonRef: Ref? by materialProps
    var Tag.centerRipple: Boolean? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.disableRipple: Boolean? by materialProps
    var Tag.disableTouchRipple: Boolean? by materialProps
    var Tag.focusRipple: Boolean? by materialProps
    var Tag.focusVisibleClassName: String? by materialProps
    var Tag.onFocusVisible: ((Event) -> Unit)? by materialProps
    var Tag.touchRippleProps: PropsWithChildren? by materialProps
    var Tag.type: ButtonStyle? by materialProps

    fun <P: PropsWithChildren> Tag.touchRippleProps(block: P.() -> Unit) { touchRippleProps = jsObject(block) }
}
