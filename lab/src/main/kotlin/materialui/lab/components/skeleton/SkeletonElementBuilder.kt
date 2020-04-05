package materialui.lab.components.skeleton

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.lab.components.skeleton.enums.SkeletonAnimation
import materialui.lab.components.skeleton.enums.SkeletonStyle
import materialui.lab.components.skeleton.enums.SkeletonVariant
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class SkeletonElementBuilder<T: Tag> internal constructor(
    type: RClass<SkeletonProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, SkeletonProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<SkeletonStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.animation: SkeletonAnimation? by materialProps
    var Tag.height: String? by materialProps
    var Tag.variant: SkeletonVariant? by materialProps
    var Tag.width: String? by materialProps

    fun Tag.height(v: String) { materialProps.height = v }
    fun Tag.height(v: Number) { materialProps.height = v }
    fun Tag.width(v: String) { materialProps.width = v }
    fun Tag.width(v: Number) { materialProps.width = v }
}