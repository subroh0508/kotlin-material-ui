package materialui.components.snackbarcontent

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class SnackbarContentElementBuilder<T: Tag> internal constructor(
    type: RClass<SnackbarContentProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : PaperElementBuilder<T, SnackbarContentProps>(type, classMap, factory) {

    var Tag.action: ReactElement? by materialProps
    var Tag.message: ReactElement? by materialProps

    fun Tag.action(block: RBuilder.() -> Unit) { action = buildElement(block) }
    fun Tag.message(block: RBuilder.() -> Unit) { message = buildElement(block) }
}