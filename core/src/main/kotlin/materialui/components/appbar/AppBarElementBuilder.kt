package materialui.components.appbar

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.appbar.enums.AppBarColor
import materialui.components.appbar.enums.AppBarPosition
import materialui.components.appbar.enums.AppBarStyle
import materialui.components.getValue
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import react.RClass

class AppBarElementBuilder<T: Tag> internal constructor(
    type: RClass<AppBarProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : PaperElementBuilder<T, AppBarProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<AppBarStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.color: AppBarColor? by materialProps
    var Tag.position: AppBarPosition? by materialProps
}