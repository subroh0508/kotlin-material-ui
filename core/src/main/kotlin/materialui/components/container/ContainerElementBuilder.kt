package materialui.components.container

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.container.enums.ContainerMaxWidth
import materialui.components.container.enums.ContainerStyle
import materialui.components.getValue
import materialui.components.setValue
import react.ComponentType

class ContainerElementBuilder<T: Tag> internal constructor(
    type: ComponentType<ContainerProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, ContainerProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ContainerStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.disableGutters: Boolean? by materialProps
    var Tag.fixed: Boolean? by materialProps
    var Tag.maxWidth: ContainerMaxWidth? by materialProps
}

