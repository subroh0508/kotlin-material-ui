package components.hidden

import components.hidden.enums.HiddenImplementation
import components.hidden.enums.HiddenWidth
import kotlinext.js.jsObject
import kotlinx.html.Tag
import react.*

class HiddenElementBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var Tag.className: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["className"]
        set(value) { props.asDynamic()["className"] = value }
    var Tag.implementation: HiddenImplementation
        get() = HiddenImplementation.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["implementation"])
        set(value) { props.asDynamic()["implementation"] = value.toString() }
    var Tag.initialWidth: HiddenWidth
        get() = HiddenWidth.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["initialWidth"])
        set(value) { props.asDynamic()["initialWidth"] = value.toString() }
    var Tag.lgDown: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["lgDown"]
        set(value) { props.asDynamic()["lgDown"] = value }
    var Tag.lgUp: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["lgUp"]
        set(value) { props.asDynamic()["lgUp"] = value }
    var Tag.mdDown: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["mdDown"]
        set(value) { props.asDynamic()["mdDown"] = value }
    var Tag.mdUp: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["mdUp"]
        set(value) { props.asDynamic()["mdUp"] = value }
    var Tag.only: List<HiddenWidth>
        get() = HiddenWidth.fromDynamic(props.asDynamic()["only"])
        set(value) { props.asDynamic()["only"] = value.map { HiddenWidth.valueOf(it.toString()) } }
    var Tag.smDown: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["smDown"]
        set(value) { props.asDynamic()["smDown"] = value }
    var Tag.smUp: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["smUp"]
        set(value) { props.asDynamic()["smUp"] = value }
    var Tag.xlDown: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["xlDown"]
        set(value) { props.asDynamic()["xlDown"] = value }
    var Tag.xlUp: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["xlUp"]
        set(value) { props.asDynamic()["xlUp"] = value }
    var Tag.xsDown: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["xsDown"]
        set(value) { props.asDynamic()["xsDown"] = value }
    var Tag.xsUp: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["xsUp"]
        set(value) { props.asDynamic()["xsUp"] = value }
}