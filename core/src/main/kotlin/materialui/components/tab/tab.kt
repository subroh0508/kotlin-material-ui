package materialui.components.tab

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.tab.enums.TabStyle
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/Tab")
private external val tabModule: dynamic

external interface TabProps : ButtonBaseProps {
    var fullWidth: Boolean?
    var icon: ReactElement?
    var indicator: ReactElement?
    var label: ReactElement?
    var selected: Boolean?
    var textColor: String?
    var value: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val tabComponent: RClass<TabProps> = tabModule.default

fun RBuilder.tab(vararg classMap: Pair<TabStyle, String>, block: TabElementBuilder<BUTTON>.() -> Unit)
    = child(TabElementBuilder(tabComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tab(vararg classMap: Pair<TabStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TabElementBuilder<T>.() -> Unit)
    = child(TabElementBuilder(tabComponent, classMap.toList(), factory).apply(block).create())
