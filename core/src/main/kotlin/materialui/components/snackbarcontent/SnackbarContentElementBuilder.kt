package materialui.components.snackbarcontent

import materialui.components.consumers
import materialui.components.paper._PaperElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class SnackbarContentElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : _PaperElementBuilder<T>(type, tag, factory) {

    var Tag.action: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["action"]
        set(value) { setProp("action", value) }
    var Tag.message: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["message"]
        set(value) { setProp("message", value) }
}