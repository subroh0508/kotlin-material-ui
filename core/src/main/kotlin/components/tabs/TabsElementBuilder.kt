package components.tabs

import components.MaterialElementBuilder
import components.consumers
import components.tabs.enums.TabsIndicatorColor
import components.tabs.enums.TabsScrollButtons
import components.tabs.enums.TabsTextColor
import components.tabs.enums.TabsVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class TabsElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.action: (Any) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["action"]
        set(value) { setProp("action", value) }
    var Tag.centered: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["centered"]
        set(value) { setProp("centered", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    @Deprecated("Instead, use the `variant=\"fullWidth\"` property.")
    var Tag.fullWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["fullWidth"]
        set(value) { setProp("fullWidth", value) }
    var Tag.indicatorColor: TabsIndicatorColor
        get() = TabsIndicatorColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["indicatorColor"])
        set(value) { setProp("indicatorColor", value.toString()) }
    var Tag.onChange: (Event, Number) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onChange"]
        set(value) { setProp("onChange", value) }
    @Deprecated("Instead, use the `variant=\"scrollable\"` property.")
    var Tag.scrollable: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["scrollable"]
        set(value) { setProp("scrollable", value) }
    var Tag.ScrollButtonComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["ScrollButtonComponent"]
        set(value) { setProp("ScrollButtonComponent", value) }
    var Tag.scrollButtons: TabsScrollButtons
        get() = TabsScrollButtons.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["scrollButtons"])
        set(value) { setProp("scrollButtons", value.toString()) }
    var Tag.TabIndicatorProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TabIndicatorProps"]
        set(value) { setProp("TabIndicatorProps", value) }
    var Tag.textColor: TabsTextColor
        get() = TabsTextColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["textColor"])
        set(value) { setProp("textColor", value.toString()) }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { setProp("theme", value) }
    var Tag.value: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"]
        set(value) { setProp("value", value) }
    var Tag.variant: TabsVariant
        get() = TabsVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}