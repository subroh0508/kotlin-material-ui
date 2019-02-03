package components.stepcontent

import components.MaterialElementBuilder
import components.step.enums.StepOrientation
import components.stepcontent.values.StepContentTransitionDuration
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class StepContentElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.active: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["active"]
        set(value) { setProp("active", value) }
    var Tag.alternativeLabel: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["alternativeLabel"]
        set(value) { setProp("alternativeLabel", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.completed: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["completed"]
        set(value) { setProp("completed", value) }
    var Tag.last: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["last"]
        set(value) { setProp("last", value) }
    var Tag.optional: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["optional"]
        set(value) { setProp("optional", value) }
    var Tag.orientation: StepOrientation
        get() = StepOrientation.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["orientation"])
        set(value) { setProp("orientation", value.toString()) }
    var Tag.TransitionComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionComponent"]
        set(value) { setProp("TransitionComponent", value) }
    var Tag.transitionDuration: StepContentTransitionDuration
        get() = StepContentTransitionDuration(jsObject = props.asDynamic()["transitionDuration"])
        set(value) { setProp("transitionDuration", value.value) }
    var Tag.TransitionProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionProps"]
        set(value) { setProp("TransitionProps", value) }
}