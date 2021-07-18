package materialui.components.button

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.button.enums.ButtonColor
import materialui.components.button.enums.ButtonSize
import materialui.components.button.enums.ButtonStyle
import materialui.components.button.enums.ButtonVariant
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import react.ComponentType
import react.RBuilder
import react.ReactElement
import react.buildElement

class ButtonElementBuilder<T: Tag> internal constructor(
    type: ComponentType<ButtonProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, ButtonProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ButtonStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.color: ButtonColor? by materialProps
    var Tag.endIcon: ReactElement? by materialProps
    var Tag.fullWidth: Boolean? by materialProps
    var Tag.href: String? by materialProps
    var Tag.size: ButtonSize? by materialProps
    var Tag.startIcon: ReactElement? by materialProps
    var Tag.variant: ButtonVariant? by materialProps

    fun Tag.endIcon(builder: RBuilder.() -> Unit) { endIcon = buildElement(builder) }
    fun Tag.startIcon(builder: RBuilder.() -> Unit) { startIcon = buildElement(builder) }
}