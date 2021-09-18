package materialui.components.tabs

internal fun tabIndicatorElement(
    block: TabIndicatorElementBuilder.() -> Unit
) = TabIndicatorElementBuilder().apply(block).create()