package materialui.components.bottomnavigationaction

import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class BottomNavigationActionElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ButtonBaseElementBuilder<T>(type, tag, factory) {

    var Tag.icon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["icon"]
        set(value) { setProp("icon", value) }
    var Tag.label: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["label"]
        set(value) { setProp("label", value) }
    var Tag.selected: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["selected"]
        set(value) { setProp("selected", value) }
    var Tag.showLabel: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["showLabel"]
        set(value) { setProp("showLabel", value) }
    var Tag.value: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"]
        set(value) { setProp("value", value) }
}