package materialui.components.portal

import kotlinext.js.jsObject
import org.w3c.dom.HTMLElement
import org.w3c.dom.Node
import react.RBuilder
import react.RClass
import react.buildElement
import react.createElement

class PortalElementBuilder internal constructor(
    val type: RClass<PortalProps>,
    private val props: PortalProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: PortalProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    fun PortalProps.container(node: Node) { props.container = node }
    fun PortalProps.container(htmlElement: HTMLElement) { props.container = htmlElement }
    fun PortalProps.container(block: RBuilder.() -> Unit) { props.container = buildElement(block) }
    fun PortalProps.onRendered(block: () -> Unit) { props.onRendered = block }
}