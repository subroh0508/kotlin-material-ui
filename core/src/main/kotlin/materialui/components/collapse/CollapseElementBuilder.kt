package materialui.components.collapse

import kotlinext.js.js
import kotlinx.css.LinearDimension
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.collapse.enums.CollapseStyle
import materialui.components.getValue
import materialui.components.setValue
import materialui.styles.muitheme.MuiTheme
import org.w3c.dom.events.Event
import react.RClass
import react.ReactElement

class CollapseElementBuilder<T: Tag> internal constructor(
    type: RClass<CollapseProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, CollapseProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<CollapseStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.collapsedHeight: LinearDimension?
        get() = materialProps.collapsedHeight
        set(value) { materialProps.collapsedHeight = value }
    var Tag.style: Any? by materialProps
    var Tag.theme: MuiTheme? by materialProps

    var Tag.`in`: Boolean? by materialProps
    var Tag.mountOnEnter: Boolean? by materialProps
    var Tag.unmountOnExit: Boolean? by materialProps
    var Tag.appear: Boolean? by materialProps
    var Tag.enter: Boolean? by materialProps
    var Tag.exit: Boolean? by materialProps
    var Tag.addEndListener: ((ReactElement, (Event) -> Unit) -> Unit)? by materialProps
    var Tag.onEnter: ((ReactElement, Boolean) -> Unit)? by materialProps
    var Tag.onEntering: ((ReactElement, Boolean) -> Unit)? by materialProps
    var Tag.onEntered: ((ReactElement, Boolean) -> Unit)? by materialProps
    var Tag.onExit: ((ReactElement) -> Unit)? by materialProps
    var Tag.onExiting: ((ReactElement) -> Unit)? by materialProps
    var Tag.onExited: ((ReactElement) -> Unit)? by materialProps

    fun Tag.timeout(msec: Long) { materialProps.timeout = msec }
    fun Tag.timeout(enter: Long, end: Long) { materialProps.timeout = js { this["enter"] = enter; this["end"] = end } }
    fun Tag.timeout() { materialProps.timeout = "auto" }
}