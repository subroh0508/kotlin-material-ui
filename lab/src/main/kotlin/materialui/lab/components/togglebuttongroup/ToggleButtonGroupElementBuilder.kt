package materialui.lab.components.togglebuttongroup

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.lab.components.togglebuttongroup.enums.ToggleButtonGroupOrientation
import materialui.lab.components.togglebuttongroup.enums.ToggleButtonGroupSize
import materialui.lab.components.togglebuttongroup.enums.ToggleButtonGroupStyle
import org.w3c.dom.events.Event
import react.ComponentType

class ToggleButtonGroupElementBuilder internal constructor(
    type: ComponentType<ToggleButtonGroupProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ToggleButtonGroupProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<ToggleButtonGroupStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.exclusive: Boolean? by materialProps
    var Tag.onChange: (Event, value: Any?) -> Unit by materialProps
    fun Tag.onChange(block: (Event, Any?) -> Unit) { onChange = block }
    var Tag.orientation: ToggleButtonGroupOrientation by materialProps
    var Tag.size: ToggleButtonGroupSize by materialProps
    var Tag.value: Any? by materialProps
}
