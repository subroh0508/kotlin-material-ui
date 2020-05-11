package materialui.components.slider

import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.slider.enums.SliderStyle
import org.w3c.dom.Node
import react.RBuilder
import react.RClass
import react.buildElement

@JsModule("@material-ui/core/Slider")
private external val sliderModule: dynamic

external interface SliderProps : StandardProps {
    // var `aria-label`: String?
    // var `aria-labelledby`: String?
    // var `aria-valuetext`: String?
    var color: String?
    var defaultValue: dynamic
    var disabled: Boolean?
    var getAriaLabel: ((Number) -> String)?
    var getAriaValueText: ((Number, Number) -> String)?
    var marks: dynamic
    var max: Number?
    var min: Number?
    var name: String?
    var onChange: ((dynamic, dynamic) -> Unit)?
    var onChangeCommitted: ((dynamic, dynamic) -> Unit)?
    var orientation: String?
    var scale: ((Number) -> Number)?
    var step: Number?
    @Suppress("PropertyName")
    var ThumbComponent: dynamic
    var track: dynamic
    var value: dynamic
    @Suppress("PropertyName")
    var ValueLabelComponent: dynamic
    var valueLabelDisplay: String?
    var valueLabelFormat: dynamic
}

external interface Mark {
    var value: Number
    var label: dynamic
}

fun Mark.label(node: Node) { label = node }
fun Mark.label(block: RBuilder.() -> Unit) { label = buildElement(block) }

@Suppress("UnsafeCastFromDynamic")
private val sliderComponent: RClass<SliderProps> = sliderModule.default

fun RBuilder.slider(vararg classMap: Pair<SliderStyle, String>, block: SliderElementBuilder<SPAN>.() -> Unit) =
    child(SliderElementBuilder(sliderComponent, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.slider(vararg classMap: Pair<SliderStyle, String>, factory: (TagConsumer<Unit>) -> T, block: SliderElementBuilder<T>.() -> Unit) =
    child(SliderElementBuilder(sliderComponent, classMap.toList(), factory).apply(block).create())
