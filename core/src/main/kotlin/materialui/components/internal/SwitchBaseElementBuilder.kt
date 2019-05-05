package materialui.components.internal

import kotlinext.js.js
import kotlinx.html.INPUT
import kotlinx.html.InputType
import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.stream.createHTML
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import react.*

abstract class SwitchBaseElementBuilder<Props: SwitchBaseProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<SPAN, Props>(type, classMap, { SPAN(mapOf(), it) }) {

    var Tag.autoFocus: Boolean? by materialProps
    var Tag.checked: Boolean? by materialProps
    var Tag.checkedIcon: ReactElement? by materialProps
    var Tag.defaultChecked: Boolean? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.disableRipple: Boolean? by materialProps
    var Tag.icon: ReactElement? by materialProps
    var Tag.id: String? by materialProps
    var Tag.inputProps: RProps? by materialProps
    var Tag.inputRef: RRef? by materialProps
    var Tag.name: String? by materialProps
    var Tag.readOnly: Boolean? by materialProps
    var Tag.required: Boolean? by materialProps
    var Tag.tabIndex: String? by materialProps
    var Tag.type: InputType? by materialProps

    fun Tag.checkedIcon(block: RBuilder.() -> Unit) { checkedIcon = buildElement(block) }
    fun Tag.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
    fun Tag.inputProps(block: INPUT.() -> Unit) {
        val props = js { }

        INPUT(mapOf(), createHTML()).apply(block).attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        inputProps = props as RProps
    }
}