package materialui.lab.components.treeItem

import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.lab.components.treeItem.enums.TreeItemStyle
import react.*
import react.dom.tag
import kotlin.reflect.KClass

class TreeItemElementBuilder<T : Tag> internal constructor(
    type: ComponentType<TreeItemProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TreeItemProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TreeItemStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.collapseIcon: ReactElement? by materialProps
    var Tag.endIcon: ReactElement? by materialProps
    var Tag.expandIcon: ReactElement? by materialProps
    var Tag.icon: ReactElement? by materialProps
    var Tag.label: ReactElement? by materialProps
    var Tag.nodeId: String? by materialProps
    @Suppress("PropertyName")
    var Tag.TransitionProps: RProps? by materialProps
    @Suppress("PropertyName")
    var Tag.TransitionComponent: Any? by materialProps

    fun Tag.collapseIcon(block: RBuilder.() -> Unit) { collapseIcon = buildElement(block) }
    fun Tag.endIcon(block: RBuilder.() -> Unit) { endIcon = buildElement(block) }
    fun Tag.expandIcon(block: RBuilder.() -> Unit) { expandIcon = buildElement(block) }
    fun Tag.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
    fun Tag.label(block: RBuilder.() -> Unit) { label = buildElement(block)     }

    @Suppress("FunctionName")
    fun Tag.TransitionComponent(tagName: String) { TransitionComponent = tagName }
    @Suppress("FunctionName")
    fun <P: RProps, C: Component<P, *>> Tag.TransitionComponent(kClass: KClass<C>) { TransitionComponent = kClass.rClass }
    @Suppress("FunctionName")
    fun <P: RProps> Tag.TransitionComponent(functionalComponent: FunctionalComponent<P>) { TransitionComponent = functionalComponent }

    @Suppress("FunctionName")
    fun <P: RProps> Tag.TransitionProps(block: P.() -> Unit) { TransitionProps = jsObject(block) }
}
