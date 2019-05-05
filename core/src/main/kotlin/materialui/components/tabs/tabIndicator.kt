package materialui.components.tabs

import react.RBuilder

internal fun RBuilder.tabIndicator(block: TabIndicatorElementBuilder.() -> Unit)
    = child(TabIndicatorElementBuilder().apply(block).create())