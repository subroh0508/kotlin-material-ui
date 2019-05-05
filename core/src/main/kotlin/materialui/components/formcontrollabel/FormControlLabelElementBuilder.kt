package materialui.components.formcontrollabel

import kotlinx.html.LABEL
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.formcontrollabel.enums.FormControlLabelPlacement
import materialui.components.formcontrollabel.enums.FormControlLabelStyle
import materialui.components.getValue
import materialui.components.setValue
import org.w3c.dom.events.Event
import react.*

class FormControlLabelElementBuilder internal constructor(
    type: RClass<FormControlLabelProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<LABEL, FormControlLabelProps>(type, classMap, { LABEL(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<FormControlLabelStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.checked: Any? by materialProps
    var Tag.control: ReactElement? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.inputRef: RRef? by materialProps
    var Tag.label: ReactElement? by materialProps
    var Tag.labelPlacement: FormControlLabelPlacement? by materialProps
    var Tag.name: String? by materialProps
    var Tag.onChange: ((Event, Boolean) -> Unit)? by materialProps
    var Tag.value: String? by materialProps

    fun Tag.checked(v: String) { checked = v }
    fun Tag.checked(v: Boolean) { checked = v }
    fun Tag.control(block: RBuilder.() -> Unit) { control = buildElement(block) }
    fun Tag.label(block: RBuilder.() -> Unit) { label = buildElement(block) }
}