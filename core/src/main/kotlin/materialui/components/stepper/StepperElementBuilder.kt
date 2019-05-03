package materialui.components.stepper

import materialui.components.consumers
import materialui.components.paper._PaperElementBuilder
import materialui.components.step.enums.StepOrientation
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class StepperElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : _PaperElementBuilder<T>(type, tag, factory) {

    var Tag.activeStep: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["activeStep"]
        set(value) { setProp("activeStep", value) }
    var Tag.alternativeLabel: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["alternativeLabel"]
        set(value) { setProp("alternativeLabel", value) }
    var Tag.connector: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["connector"]
        set(value) { setProp("connector", value) }
    var Tag.nonLinear: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["nonLinear"]
        set(value) { setProp("nonLinear", value) }
    var Tag.orientation: StepOrientation
        get() = StepOrientation.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["orientation"])
        set(value) { setProp("orientation", value.toString()) }
}