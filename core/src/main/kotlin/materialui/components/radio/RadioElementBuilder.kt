package materialui.components.radio

import kotlinx.html.Tag
import materialui.components.getValue
import materialui.components.internal.SwitchBaseElementBuilder
import materialui.components.radio.enums.RadioColor
import materialui.components.radio.enums.RadioStyle
import materialui.components.setValue
import react.RClass

class RadioElementBuilder internal constructor(
    type: RClass<RadioProps>,
    classMap: List<Pair<Enum<*>, String>>
) : SwitchBaseElementBuilder<RadioProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<RadioStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.color: RadioColor by materialProps
    var Tag.value: Any? by materialProps

    fun Tag.value(v: String) { value = v }
    fun Tag.value(v: Number) { value = v }
    fun Tag.value(v: Boolean) { value = v }
}