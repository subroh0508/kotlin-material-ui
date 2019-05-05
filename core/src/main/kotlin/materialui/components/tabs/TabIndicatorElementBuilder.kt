package materialui.components.tabs

import kotlinx.html.SPAN
import kotlinx.html.Tag
import materialui.components.tabs.enums.TabsIndicatorColor
import react.dom.RDOMBuilder

class TabIndicatorElementBuilder internal constructor() : RDOMBuilder<SPAN>({ SPAN(mapOf(), it) }) {
    var Tag.color: TabsIndicatorColor?
        get() = (asDynamic()["color"] as String?)?.let { TabsIndicatorColor.valueOf(it) }
        set(value) { asDynamic()["color"] = value?.toString() }
}