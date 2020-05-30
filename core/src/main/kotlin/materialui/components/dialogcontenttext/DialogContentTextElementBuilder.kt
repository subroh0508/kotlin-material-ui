package materialui.components.dialogcontenttext

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.typography.TypographyElementBuilder
import react.RClass

class DialogContentTextElementBuilder<T: Tag> internal constructor(
    type: RClass<DialogContentTextProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : TypographyElementBuilder<T, DialogContentTextProps>(type, classMap, factory)
