package components.steplabel

import components.MaterialElementBuilder
import components.step.enums.StepOrientation
import kotlinx.html.SPAN
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class StepLabelElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<SPAN>(type, { SPAN(mapOf(), it) }) {

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
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.error: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["error"]
        set(value) { setProp("error", value) }
    var Tag.icon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["icon"]
        set(value) { setProp("icon", value) }
    var Tag.last: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["last"]
        set(value) { setProp("last", value) }
    var Tag.optional: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["optional"]
        set(value) { setProp("optional", value) }
    var Tag.orientation: StepOrientation
        get() = StepOrientation.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["orientation"])
        set(value) { setProp("orientation", value.toString()) }
    var Tag.StepIconComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["StepIconComponent"]
        set(value) { setProp("StepIconComponent", value) }
    var Tag.StepIconProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["StepIconProps"]
        set(value) { setProp("StepIconProps", value) }
}