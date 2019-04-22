package materialui.components.stepicon

import kotlinext.js.jsObject
import react.*

class StepIconElementBuilder internal constructor(
    private val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.active: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["active"]
        set(value) { props.asDynamic()["active"] = value }
    var RProps.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { props.asDynamic()["classes"] = value }
    var RProps.completed: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["completed"]
        set(value) { props.asDynamic()["completed"] = value }
    var RProps.error: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["error"]
        set(value) { props.asDynamic()["error"] = value }
    var RProps.icon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["icon"]
        set(value) { props.asDynamic()["icon"] = value }
}