package materialui.components.snackbarcontent

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import react.*

class SnackbarContentElementBuilder<T: Tag> internal constructor(
    type: ComponentType<SnackbarContentProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : PaperElementBuilder<T, SnackbarContentProps>(type, classMap, factory) {

    var Tag.action: ReactElement? by materialProps
    var Tag.message: ReactElement? by materialProps

    fun Tag.action(block: RBuilder.() -> Unit) { action = buildElement(block) }
    fun Tag.message(block: RBuilder.() -> Unit) { message = buildElement(block) }
}