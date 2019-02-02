package components.expansionpanel

import components.consumers
import components.paper.PaperElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class ExpansionPanelElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : PaperElementBuilder<T>(type, tag, factory) {

    var Tag.collapseProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["CollapseProps"]
        set(value) { setProp("CollapseProps", value) }
    var Tag.defaultExpanded: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["defaultExpanded"]
        set(value) { setProp("defaultExpanded", value) }
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.expanded: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["expanded"]
        set(value) { setProp("expanded", value) }
    var Tag.onChange: (Event, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onChange"]
        set(value) { setProp("onChange", value) }
}