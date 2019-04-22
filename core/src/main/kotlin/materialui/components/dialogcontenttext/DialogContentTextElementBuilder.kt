package materialui.components.dialogcontenttext

import materialui.components.consumers
import materialui.components.typography.TypographyElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class DialogContentTextElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : TypographyElementBuilder<T>(type, tag, factory)