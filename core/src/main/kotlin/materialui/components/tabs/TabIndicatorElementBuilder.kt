package materialui.components.tabs

import kotlinx.css.CSSBuilder
import kotlinx.css.RuleSet
import kotlinx.html.SPAN
import kotlinx.html.Tag
import materialui.components.tabs.enums.TabsIndicatorColor
import react.ReactElement
import react.dom.RDOMBuilder
import styled.Styled

class TabIndicatorElementBuilder internal constructor() : RDOMBuilder<SPAN>({ SPAN(mapOf(), it) }) {
    val css = CSSBuilder()

    var Tag.color: TabsIndicatorColor?
        get() = (asDynamic()["color"] as String?)?.let { TabsIndicatorColor.valueOf(it) }
        set(value) { asDynamic()["color"] = value?.toString() }

    fun css(ruleSet: RuleSet) {
        css.apply(ruleSet)
    }

    override fun create(): ReactElement = Styled.createElement(attrs.tagName, css, props, childList)
}