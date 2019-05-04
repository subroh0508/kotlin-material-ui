package materialui.components.switches

import kotlinx.html.Tag
import materialui.components.getValue
import materialui.components.internal.SwitchBaseElementBuilder
import materialui.components.setValue
import materialui.components.switches.enums.SwitchColor
import materialui.components.switches.enums.SwitchStyle
import react.RClass

class SwitchElementBuilder internal constructor(
    type: RClass<SwitchProps>,
    classMap: List<Pair<Enum<*>, String>>
) : SwitchBaseElementBuilder<SwitchProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<SwitchStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.color: SwitchColor? by materialProps

    fun Tag.value(v: String) { materialProps.value = v }
    fun Tag.value(v: Number) { materialProps.value = v }
    fun Tag.value(v: Boolean) { materialProps.value = v }
}