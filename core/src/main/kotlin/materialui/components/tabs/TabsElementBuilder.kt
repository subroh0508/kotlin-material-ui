package materialui.components.tabs

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.tabs.enums.*
import materialui.styles.muitheme.MuiTheme
import org.w3c.dom.events.Event
import react.Component
import react.RBuilder
import react.RClass
import react.RProps
import kotlin.reflect.KClass

class TabsElementBuilder<T: Tag> internal constructor(
    type: RClass<TabsProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TabsProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TabsStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.action: (TabsActions) -> Unit by materialProps
    var Tag.centered: Boolean? by materialProps
    @Deprecated("Instead, use the `variant=\"fullWidth\"` property.")
    var Tag.fullWidth: Boolean? by materialProps
    var Tag.indicatorColor: TabsIndicatorColor? by materialProps
    var Tag.onChange: ((Event, Int) -> Unit)? by materialProps
    @Deprecated("Instead, use the `variant=\"scrollable\"` property.")
    var Tag.scrollable: Boolean? by materialProps
    var Tag.scrollButtons: TabsScrollButtons? by materialProps
    var Tag.TabIndicatorProps: RProps? by materialProps
    var Tag.textColor: TabsTextColor? by materialProps
    var Tag.theme: MuiTheme? by materialProps
    var Tag.value: Any? by materialProps
    var Tag.variant: TabsVariant? by materialProps

    fun Tag.action(block: (TabsActions) -> Unit) { action = block }
    fun <P: RProps, C: Component<P, *>> Tag.scrollButtonComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.ScrollButtonComponent = kClass.js as RClass<P>
    }
    fun Tag.scrollButtonComponent(tagName: String) { materialProps.ScrollButtonComponent = tagName }
    fun Tag.tabIndicatorProps(block: TabIndicatorElementBuilder.() -> Unit) {
        TabIndicatorProps = RBuilder().tabIndicator(block).props
    }
}