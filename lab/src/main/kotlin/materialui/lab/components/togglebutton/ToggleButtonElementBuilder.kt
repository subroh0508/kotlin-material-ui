package materialui.lab.components.togglebutton

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.lab.components.togglebutton.enums.ToggleButtonStyle
import react.ComponentType

class ToggleButtonElementBuilder<T: Tag> internal constructor(
    type: ComponentType<ToggleButtonProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, ToggleButtonProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ToggleButtonStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.disableFocusRipple: Boolean? by materialProps
    var Tag.selected: Boolean? by materialProps
    var Tag.value: Any? by materialProps
}
