package materialui.components.bottomnavigation

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class BottomNavigationElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.showLabels: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["showLabels"]
        set(value) { setProp("showLabels", value) }
    var Tag.value: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"]
        set(value) { setProp("value", value) }}