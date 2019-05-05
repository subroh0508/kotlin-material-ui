package materialui.components.steplabel

import kotlinext.js.jsObject
import kotlinx.html.SPAN
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.step.enums.StepOrientation
import materialui.components.stepicon.StepIconProps
import materialui.components.steplabel.enums.StepLabelStyle
import react.*
import kotlin.reflect.KClass

class StepLabelElementBuilder internal constructor(
    type: RClass<StepLabelProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<SPAN, StepLabelProps>(type, classMap, { SPAN(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<StepLabelStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.active: Boolean? by materialProps
    var Tag.alternativeLabel: Boolean? by materialProps
    var Tag.completed: Boolean? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.error: Boolean? by materialProps
    var Tag.icon: ReactElement? by materialProps
    var Tag.last: Boolean? by materialProps
    var Tag.optional: ReactElement? by materialProps
    var Tag.orientation: StepOrientation? by materialProps
    var Tag.StepIconProps: RProps? by materialProps

    fun Tag.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
    fun <P: RProps, C: Component<P, *>> Tag.stepIconComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.StepIconComponent = kClass.js as RClass<P>
    }
    fun Tag.optional(block: RBuilder.() -> Unit) { optional = buildElement(block) }
    fun Tag.stepIconComponent(tagName: String) { materialProps.StepIconComponent = tagName }
    fun Tag.stepIconProps(block: StepIconProps.() -> Unit) { StepIconProps = jsObject(block) }
}