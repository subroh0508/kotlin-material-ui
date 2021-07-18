package materialui.components.dialogcontenttext

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.typography.TypographyElementBuilder
import react.ComponentType

class DialogContentTextElementBuilder<T: Tag> internal constructor(
    type: ComponentType<DialogContentTextProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : TypographyElementBuilder<T, DialogContentTextProps>(type, classMap, factory)
