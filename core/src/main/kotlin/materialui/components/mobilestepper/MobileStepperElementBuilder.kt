package materialui.components.mobilestepper

import materialui.components.consumers
import materialui.components.mobilestepper.enums.MobileStepperPosition
import materialui.components.mobilestepper.enums.MobileStepperVariant
import materialui.components.paper.PaperElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class MobileStepperElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : PaperElementBuilder<T>(type, tag, factory) {

    var Tag.activeStep: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["activeStep"]
        set(value) { setProp("activeStep", value) }
    var Tag.backButton: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["backButton"]
        set(value) { setProp("backButton", value) }
    var Tag.linearProgressProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["LinearProgressProps"]
        set(value) { setProp("LinearProgressProps", value) }
    var Tag.nextButton: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["nextButton"]
        set(value) { setProp("nextButton", value) }
    var Tag.position: MobileStepperPosition
        get() = MobileStepperPosition.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["position"])
        set(value) { setProp("position", value.toString()) }
    var Tag.steps: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["steps"]
        set(value) { setProp("steps", value) }
    var Tag.variant: MobileStepperVariant
        get() = MobileStepperVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}