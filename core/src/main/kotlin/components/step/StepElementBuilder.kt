package components.step

import components.MaterialElementBuilder
import components.step.enums.StepOrientation
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class StepElementBuilder internal constructor(
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
    var Tag.connector: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["connector"]
        set(value) { setProp("connector", value) }
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.index: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["index"]
        set(value) { setProp("index", value) }
    var Tag.last: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["last"]
        set(value) { setProp("last", value) }
    var Tag.orientation: StepOrientation
        get() = StepOrientation.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["orientation"])
        set(value) { setProp("orientation", value.toString()) }
}