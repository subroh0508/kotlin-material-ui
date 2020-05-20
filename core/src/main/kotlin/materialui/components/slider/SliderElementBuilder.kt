package materialui.components.slider

import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.slider.enums.SliderColor
import materialui.components.slider.enums.SliderOrientation
import materialui.components.slider.enums.SliderTrack
import materialui.components.slider.enums.SliderValueLabelDisplay
import materialui.components.snackbar.SnackbarProps
import react.*
import react.dom.tag
import kotlin.reflect.KClass

class SliderElementBuilder<T: Tag> internal constructor(
    type: RClass<SliderProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, SliderProps>(type, classMap, factory) {
    var Tag.ariaLabel: String?
        get() = get("aria-label") as? String
        set(value) { setProp("aria-label", value) }
    var Tag.ariaLabelledby: String?
        get() = get("aria-labelledby") as? String
        set(value) { setProp("aria-labelledby", value) }
    var Tag.ariaValuetext: String?
        get() = get("aria-valuetext") as? String
        set(value) { setProp("aria-valuetext", value) }
    var Tag.color: SliderColor? by materialProps

    var Tag.defaultValue: Any? by materialProps
    fun Tag.defaultValue(vararg value: Number) { defaultValue = if (value.size == 1) value.first() else value }

    var Tag.disabled: Boolean? by materialProps

    var Tag.getAriaLabel: ((Number) -> String)? by materialProps
    fun Tag.getAriaLabel(block: (Number) -> String) { getAriaLabel = block }

    var Tag.getAriaValueText: ((Number, Number) -> String)? by materialProps
    fun Tag.getAriaValueText(block: (Number, Number) -> String) { getAriaValueText = block }

    var Tag.marks: Any? by materialProps
    fun Tag.marks(v: Boolean) { marks = v }
    fun Tag.marks(v: List<Mark>) { marks = v.toTypedArray() }
    fun Tag.marks(vararg block: Mark.() -> Unit) { marks = block.map { jsObject(it) }.toTypedArray() }

    var Tag.max: Number? by materialProps
    var Tag.min: Number? by materialProps
    var Tag.name: String? by materialProps
    var Tag.onChange: ((Any, dynamic) -> Unit)? by materialProps
    fun Tag.onChange(block: (Any, Number) -> Unit) { onChange = block }
    fun Tag.onChange(block: (Any, Array<Number>) -> Unit) { onChange = block }

    var Tag.onChangeCommitted: ((Any, dynamic) -> Unit)? by materialProps
    fun Tag.onChangeCommitted(block: (Any, Number) -> Unit) { onChangeCommitted = block }
    fun Tag.onChangeCommitted(block: (Any, Array<Number>) -> Unit) { onChangeCommitted = block }

    var Tag.orientation: SliderOrientation? by materialProps

    var Tag.scale: ((Number) -> Number)? by materialProps
    fun Tag.scale(block: (Number) -> Number) { scale = block }

    var Tag.step: Number? by materialProps

    @Suppress("PropertyName")
    var Tag.ThumbComponent: Any? by materialProps
    @Suppress("FunctionName")
    fun Tag.ThumbComponent(tagName: String) { ThumbComponent = tagName }
    @Suppress("FunctionName")
    fun <P: RProps, C: Component<P, *>> Tag.ThumbComponent(kClass: KClass<C>) { ThumbComponent = kClass.js.unsafeCast<RClass<P>>() }
    @Suppress("FunctionName")
    fun <P: RProps> Tag.ThumbComponent(functionalComponent: FunctionalComponent<P>) { ThumbComponent = functionalComponent }

    var Tag.track: SliderTrack? by materialProps
    var Tag.value: Any? by materialProps
    fun Tag.value(vararg v: Number?) { value = if (v.size == 1) v.first() else v }

    @Suppress("PropertyName")
    var Tag.ValueLabelComponent: Any? by materialProps
    @Suppress("FunctionName")
    fun Tag.ValueLabelComponent(tagName: String) { ValueLabelComponent = tagName }
    @Suppress("FunctionName")
    fun <P: RProps, C: Component<P, *>> Tag.ValueLabelComponent(kClass: KClass<C>) { ValueLabelComponent = kClass.js.unsafeCast<RClass<P>>() }
    @Suppress("FunctionName")
    fun <P: RProps> Tag.ValueLabelComponent(functionalComponent: FunctionalComponent<P>) { ValueLabelComponent = functionalComponent }

    var Tag.valueLabelDisplay: SliderValueLabelDisplay? by materialProps
    var Tag.valueLabelFormat: Any? by materialProps
    fun Tag.valueLabelFormat(format: String) { valueLabelFormat = format }
    fun Tag.valueLabelFormat(block: RBuilder.(Number, Number) -> Any) { valueLabelFormat = { v: Number, i: Number -> buildElement { block(v, i) } } }
}
