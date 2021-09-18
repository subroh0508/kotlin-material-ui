package materialui.components.select

import kotlinext.js.js
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.stream.createHTML
import materialui.components.getValue
import materialui.components.input.InputElementBuilder
import materialui.components.input.InputProps
import materialui.components.input.inputElement
import materialui.components.menu.MenuElementBuilder
import materialui.components.menu.menuElement
import materialui.components.select.enums.SelectStyle
import materialui.components.select.enums.SelectVariant
import materialui.components.setValue
import org.w3c.dom.events.Event
import react.*
import kotlin.reflect.KClass

class SelectElementBuilder internal constructor(
    type: ComponentType<SelectProps>,
    classMap: List<Pair<Enum<*>, String>>
) : InputElementBuilder<SelectProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<SelectStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.autoWidth: Boolean? by materialProps
    var Tag.displayEmpty: Boolean? by materialProps
    var Tag.input: ReactElement? by materialProps
    var Tag.MenuProps: PropsWithChildren? by materialProps
    var Tag.multiple: Boolean? by materialProps
    var Tag.native: Boolean? by materialProps
    var Tag.onClose: ((Event) -> Unit)? by materialProps
    var Tag.onOpen: ((Event) -> Unit)? by materialProps
    var Tag.open: Boolean? by materialProps
    var Tag.SelectDisplayProps: PropsWithChildren? by materialProps
    var Tag.variant: SelectVariant? by materialProps

    fun <P : PropsWithChildren, C : Component<P, *>> Tag.iconComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
        materialProps.IconComponent = kClass.js as ComponentClass<P>
    }
    fun Tag.input(block: InputElementBuilder<InputProps>.() -> Unit) { input = inputElement(block = block) }
    fun Tag.input(block: RBuilder.() -> Unit) { input = buildElement(block) }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.menuProps(block: MenuElementBuilder.() -> Unit) {
        MenuProps = menuElement(block = block).props as PropsWithChildren
    }
    fun <V: Any> Tag.renderValue(block: (V) -> ReactElement) { materialProps.renderValue = block }
    fun Tag.selectDisplayProps(block: DIV.() -> Unit) {
        val props = js {  }

        DIV(mapOf(), createHTML()).apply(block).attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        SelectDisplayProps = props as PropsWithChildren
    }
}