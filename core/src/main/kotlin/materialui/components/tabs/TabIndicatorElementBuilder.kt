package materialui.components.tabs

import kotlinx.css.CSSBuilder
import kotlinx.css.RuleSet
import kotlinx.html.SPAN
import kotlinx.html.Tag
import materialui.components.tabs.enums.TabsIndicatorColor
import materialui.styles.toDynamic
import react.dom.RDOMBuilderImpl
import react.dom.setProp

class TabIndicatorElementBuilder internal constructor() : RDOMBuilderImpl<SPAN>({ SPAN(mapOf(), it) }) {
    var Tag.color: TabsIndicatorColor?
        get() = (asDynamic()["color"] as String?)?.let { TabsIndicatorColor.valueOf(it) }
        set(value) { asDynamic()["color"] = value?.toString() }

    fun style(ruleSet: RuleSet) {
        setProp("style", CSSBuilder().apply(ruleSet).toDynamic)
    }
}