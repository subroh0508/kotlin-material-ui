package materialui.components.tab

import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.consumers
import materialui.components.tab.enums.TabTextColor
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class TabElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ButtonBaseElementBuilder<T>(type, tag, factory) {

    var Tag.fullWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["fullWidth"]
        set(value) { setProp("fullWidth", value) }
    var Tag.icon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["icon"]
        set(value) { setProp("icon", value) }
    var Tag.indicator: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["indicator"]
        set(value) { setProp("indicator", value) }
    var Tag.label: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["label"]
        set(value) { setProp("label", value) }
    var Tag.selected: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["selected"]
        set(value) { setProp("selected", value) }
    var Tag.textColor: TabTextColor
        get() = TabTextColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["textColor"])
        set(value) { setProp("textColor", value.toString()) }
    var Tag.value: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"]
        set(value) { setProp("value", value) }
}