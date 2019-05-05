package materialui.components.stepcontent

import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.step.enums.StepOrientation
import materialui.components.stepcontent.enums.StepContentStyle
import materialui.reacttransiton.RTransitionProps
import react.Component
import react.RClass
import react.RProps
import kotlin.reflect.KClass

class StepContentElementBuilder internal constructor(
    type: RClass<StepContentProps>,
    classMap: List<Pair<StepContentStyle, String>>
) : MaterialElementBuilder<DIV, StepContentProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<StepContentStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.active: Boolean? by materialProps
    var Tag.alternativeLabel: Boolean? by materialProps
    var Tag.completed: Boolean? by materialProps
    var Tag.last: Boolean? by materialProps
    var Tag.optional: Boolean? by materialProps
    var Tag.orientation: StepOrientation? by materialProps
    var Tag.transitionDuration: Any? by materialProps
    var Tag.TransitionProps: RTransitionProps? by materialProps

    fun <P: RProps, C: Component<P, *>> Tag.transitionComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.TransitionComponent = kClass.js as RClass<P>
    }
    fun Tag.transitionComponent(tagName: String) { materialProps.TransitionComponent = tagName }
    fun Tag.transitionDuration(msec: Long) { materialProps.transitionDuration = msec }
    fun Tag.transitionDuration(start: Long? = null, exit: Long? = null) { materialProps.transitionDuration = js { this["start"] = start; this["exit"] = exit } }
    fun Tag.transitionDuration(auto: String = "auto") { materialProps.transitionDuration = auto }
    fun Tag.transitionProps(block: RTransitionProps.() -> Unit) { TransitionProps = jsObject(block) }
}