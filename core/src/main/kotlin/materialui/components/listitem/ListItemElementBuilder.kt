package materialui.components.listitem

import kotlinext.js.js
import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.stream.createHTML
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.listitem.enums.ListItemAlignItem
import materialui.components.listitem.enums.ListItemStyle
import materialui.components.setValue
import react.Component
import react.RClass
import react.RProps
import react.dom.RDOMBuilder
import kotlin.reflect.KClass

open class ListItemElementBuilder<T: Tag, Props: ListItemProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, Props>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ListItemStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.alignItems: ListItemAlignItem? by materialProps
    var Tag.button: Boolean? by materialProps
    var Tag.ContainerProps: RProps? by materialProps
    var Tag.dense: Boolean? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.disableGutters: Boolean? by materialProps
    var Tag.divider: Boolean? by materialProps
    var Tag.selected: Boolean? by materialProps

    fun <P: RProps, C: Component<P, *>> Tag.containerComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.ContainerComponent = kClass.js as RClass<P>
    }
    fun Tag.containerComponent(tagName: String) { materialProps.ContainerComponent = tagName }
    fun Tag.containerProps(block: LI.() -> Unit) {
        val props = js {  }

        LI(mapOf(), createHTML()).apply(block).attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        ContainerProps = props as RProps
    }
    fun <T2: Tag> Tag.containerProps(factory: (TagConsumer<Unit>) -> T2, block: RDOMBuilder<T2>.() -> Unit) {
        val props = js {  }

        RDOMBuilder(factory).apply(block).attrs.attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        ContainerProps = props as RProps
    }
}