package materialui.components.inputbase

import kotlinext.js.js
import kotlinx.css.Color
import kotlinx.html.DIV
import kotlinx.html.INPUT
import kotlinx.html.InputType
import kotlinx.html.Tag
import kotlinx.html.stream.createHTML
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.inputadornment.InputAdornmentElementBuilder
import materialui.components.inputadornment.inputAdornment
import materialui.components.inputbase.enums.InputBaseStyle
import materialui.components.inputbase.enums.InputMargin
import materialui.components.setValue
import org.w3c.dom.events.Event
import react.*
import kotlin.js.Date
import kotlin.reflect.KClass

open class InputBaseElementBuilder<Props: InputBaseProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, Props>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<InputBaseStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.autoComplete: String? by materialProps
    var Tag.autoFocus: Boolean? by materialProps
    var Tag.defaultValue: Any? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.endAdornment: ReactElement? by materialProps
    var Tag.error: Boolean? by materialProps
    var Tag.fullWidth: Boolean? by materialProps
    var Tag.id: String? by materialProps
    var Tag.inputProps: RProps? by materialProps
    var Tag.inputRef: RRef? by materialProps
    var Tag.margin: InputMargin? by materialProps
    var Tag.multiline: Boolean? by materialProps
    var Tag.name: String? by materialProps
    var Tag.onEmpty: ((Event) -> Unit)? by materialProps
    var Tag.onFilled: ((Event) -> Unit)? by materialProps
    var Tag.placeholder: String? by materialProps
    var Tag.readOnly: Boolean? by materialProps
    var Tag.required: Boolean? by materialProps
    var Tag.rows: String? by materialProps
    var Tag.rowsMax: String? by materialProps
    var Tag.startAdornment: ReactElement? by materialProps
    var Tag.type: InputType? by materialProps
    var Tag.value: Any? by materialProps

    fun Tag.defaultValue(v: String) { defaultValue = v }
    fun Tag.defaultValue(v: Number) { defaultValue = v }
    fun Tag.defaultValue(v: Boolean) { defaultValue = v }
    fun Tag.defaultValue(v: Date) { defaultValue = v }
    fun Tag.defaultValue(v: Color) { defaultValue = v.toString() }
    fun Tag.endAdornment(block: InputAdornmentElementBuilder<DIV>.() -> Unit) {
        endAdornment = RBuilder().inputAdornment(block = block)
    }
    fun <P: RProps, C: Component<P, *>> Tag.inputComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.inputComponent = kClass.js as RClass<P>
    }
    fun Tag.inputProps(block: INPUT.() -> Unit) {
        val props = js {  }

        INPUT(mapOf(), createHTML()).apply(block).attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        inputProps = props as RProps
    }
    fun Tag.startAdornment(block: InputAdornmentElementBuilder<DIV>.() -> Unit) {
        startAdornment = RBuilder().inputAdornment(block = block)
    }
    fun Tag.rows(v: String) { materialProps.rows = v }
    fun Tag.rows(v: Number) { materialProps.rows = v }
    fun Tag.rowsMax(v: String) { materialProps.rowsMax = v }
    fun Tag.rowsMax(v: Number) { materialProps.rowsMax = v }
    fun Tag.value(v: String) { value = v }
    fun Tag.value(v: Number) { value = v }
    fun Tag.value(v: Boolean) { value = v }
    fun Tag.value(v: Date) { value = v }
    fun Tag.value(v: Color) { value = v.toString() }
}
