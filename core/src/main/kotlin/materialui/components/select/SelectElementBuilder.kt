package materialui.components.select

import kotlinext.js.js
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.stream.createHTML
import materialui.components.getValue
import materialui.components.input.InputElementBuilder
import materialui.components.input.InputProps
import materialui.components.input.input
import materialui.components.menu.MenuElementBuilder
import materialui.components.menu.menu
import materialui.components.select.enums.SelectStyle
import materialui.components.select.enums.SelectVariant
import materialui.components.setValue
import org.w3c.dom.events.Event
import react.*
import kotlin.reflect.KClass

class SelectElementBuilder internal constructor(
    type: RClass<SelectProps>,
    classMap: List<Pair<Enum<*>, String>>
) : InputElementBuilder<SelectProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<SelectStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.autoWidth: Boolean? by materialProps
    var Tag.displayEmpty: Boolean? by materialProps
    var Tag.input: ReactElement? by materialProps
    var Tag.MenuProps: RProps? by materialProps
    var Tag.multiple: Boolean? by materialProps
    var Tag.native: Boolean? by materialProps
    var Tag.onClose: ((Event) -> Unit)? by materialProps
    var Tag.onOpen: ((Event) -> Unit)? by materialProps
    var Tag.open: Boolean? by materialProps
    var Tag.SelectDisplayProps: RProps? by materialProps
    var Tag.variant: SelectVariant? by materialProps

    fun <P : RProps, C : Component<P, *>> Tag.iconComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.IconComponent = kClass.js as RClass<P>
    }
    fun Tag.input(block: InputElementBuilder<InputProps>.() -> Unit) { input = RBuilder().input(block = block) }
    fun Tag.input(block: RBuilder.() -> Unit) { input = buildElement(block) }
    fun Tag.menuProps(block: MenuElementBuilder.() -> Unit) {
        MenuProps = RBuilder().menu(block = block).props
    }
    fun <V: Any> Tag.renderValue(block: (V) -> ReactElement) { materialProps.renderValue = block }
    fun Tag.selectDisplayProps(block: DIV.() -> Unit) {
        val props = js {  }

        DIV(mapOf(), createHTML()).apply(block).attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        SelectDisplayProps = props as RProps
    }
}