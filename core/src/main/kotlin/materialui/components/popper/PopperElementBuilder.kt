package materialui.components.popper

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.popper.enums.PopperPlacement
import materialui.components.setValue
import org.w3c.dom.HTMLElement
import org.w3c.dom.Node
import react.RBuilder
import react.RClass
import react.buildElement

class PopperElementBuilder internal constructor(
    type: RClass<PopperProps>
) : MaterialElementBuilder<DIV, PopperProps>(type, listOf(), { DIV(mapOf(), it) }) {

    var Tag.disablePortal: Boolean? by materialProps
    var Tag.keepMounted: Boolean? by materialProps
    var Tag.modifiers: Any? by materialProps
    var Tag.open: Boolean? by materialProps
    var Tag.placement: PopperPlacement? by materialProps
    var Tag.popperOptions: Any? by materialProps
    var Tag.transition: Boolean? by materialProps

    fun Tag.anchorEl(node: Node) { materialProps.anchorEl = node }
    fun Tag.anchorEl(htmlElement: HTMLElement) { materialProps.anchorEl = htmlElement }
    fun Tag.anchorEl(block: RBuilder.() -> Unit) { materialProps.anchorEl = buildElement(block) }
    fun Tag.anchorEl(func: (HTMLElement) -> HTMLElement) { materialProps.anchorEl = func }
    fun Tag.container(node: Node) { materialProps.container = node }
    fun Tag.container(htmlElement: HTMLElement) { materialProps.container = htmlElement }
    fun Tag.container(block: RBuilder.() -> Unit) { materialProps.container = buildElement(block) }
}