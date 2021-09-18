package materialui.components.textfield

import kotlinext.js.js
import kotlinx.css.Color
import kotlinx.html.*
import kotlinx.html.stream.createHTML
import materialui.components.formcontrol.FormControlElementBuilder
import materialui.components.get
import materialui.components.getValue
import materialui.components.input.InputElementBuilder
import materialui.components.input.InputProps
import materialui.components.input.input
import materialui.components.input.inputElement
import materialui.components.inputlabel.InputLabelElementBuilder
import materialui.components.inputlabel.inputLabel
import materialui.components.inputlabel.inputLabelElement
import materialui.components.select.SelectElementBuilder
import materialui.components.select.select
import materialui.components.select.selectElement
import materialui.components.set
import materialui.components.setValue
import materialui.components.textfield.enums.TextFieldSize
import react.*
import react.dom.setProp
import kotlin.js.Date

class TextFieldElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TextFieldProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : FormControlElementBuilder<T, TextFieldProps>(type, classMap, factory) {

    var Tag.autoComplete: String? by materialProps
    var Tag.autoFocus: Boolean? by materialProps
    var Tag.defaultValue: Any? by materialProps
    var Tag.FormHelperTextProps: PropsWithChildren
        get() = @Suppress("UnsafeCastFromDynamic") domProps.asDynamic()["FormHelperTextProps"]
        set(value) { setProp("FormHelperTextProps", value) }
    var Tag.helperText: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") domProps.asDynamic()["helperText"]
        set(value) { setProp("helperText", value) }
    var Tag.id: String? by materialProps
    var Tag.InputLabelProps: PropsWithChildren? by materialProps
    var Tag.InputProps: PropsWithChildren? by materialProps
    var Tag.inputProps: PropsWithChildren? by materialProps
    var Tag.inputRef: Ref<*>? by materialProps
    var Tag.label: ReactElement? by materialProps
    var Tag.multiline: Boolean? by materialProps
    var Tag.name: String? by materialProps
    var Tag.placeholder: String? by materialProps
    var Tag.rows: Any? by materialProps
    var Tag.rowsMax: Any? by materialProps
    var Tag.select: Boolean? by materialProps
    var Tag.SelectProps: PropsWithChildren? by materialProps
    var Tag.size: TextFieldSize? // issue: Enum? problem with <reified T: Enum<T>> StandardProps.getValue()
        get() = materialProps.get<TextFieldSize>("size")
        set(value) { materialProps.set("size",value) }
    var Tag.type: InputType? by materialProps
    var Tag.value: Any? by materialProps

    fun Tag.defaultValue(v: String) { defaultValue = v }
    fun Tag.defaultValue(v: Number) { defaultValue = v }
    fun Tag.defaultValue(v: Boolean) { defaultValue = v }
    fun Tag.defaultValue(v: Date) { defaultValue = v }
    fun Tag.defaultValue(v: Color) { defaultValue = v.toString() }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.inputLabelProps(block: InputLabelElementBuilder<LABEL>.() -> Unit) {
        InputLabelProps = inputLabelElement(block = block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun <T2: Tag> Tag.inputLabelProps(factory: (TagConsumer<Unit>) -> T2, block: InputLabelElementBuilder<T2>.() -> Unit) {
        InputLabelProps = inputLabelElement(factory = factory, block = block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.inputProps(block: InputElementBuilder<InputProps>.() -> Unit) {
        InputProps = inputElement(block = block).props as PropsWithChildren
    }
    fun Tag.nativeInputProps(block: INPUT.() -> Unit) {
        val props = js {  }

        INPUT(mapOf(), createHTML()).apply(block).attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        inputProps = props as PropsWithChildren
    }
    fun Tag.label(block: RBuilder.() -> Unit) { label = buildElement(block) }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.selectProps(block: SelectElementBuilder.() -> Unit) {
        SelectProps = selectElement(block = block).props as PropsWithChildren
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