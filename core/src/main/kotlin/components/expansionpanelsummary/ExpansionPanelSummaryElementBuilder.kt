package components.expansionpanelsummary

import components.buttonbase.ButtonBaseElementBuilder
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class ExpansionPanelSummaryElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ButtonBaseElementBuilder<T>(type, tag, factory) {

    var Tag.expanded: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["expanded"]
        set(value) { setProp("expanded", value) }
    var Tag.expandIcon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["expandIcon"]
        set(value) { setProp("expandIcon", value) }
    var Tag.iconButtonProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["IconButtonProps"]
        set(value) { setProp("IconButtonProps", value) }
}