package materialui.components.nativeselect

import kotlinx.html.Tag
import materialui.components.getValue
import materialui.components.input.InputElementBuilder
import materialui.components.nativeselect.enums.NativeSelectStyle
import materialui.components.nativeselect.enums.NativeSelectVariant
import materialui.components.setValue
import react.*
import kotlin.reflect.KClass

class NativeSelectElementBuilder internal constructor(
    type: RClass<NativeSelectProps>,
    classMap: List<Pair<Enum<*>, String>>
) : InputElementBuilder<NativeSelectProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<NativeSelectStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.iconComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["IconComponent"]
        set(value) { setProp("IconComponent", value) }
    var Tag.input: ReactElement? by materialProps
    var Tag.variant: NativeSelectVariant? by materialProps

    fun <P : RProps, C : Component<P, *>> Tag.iconComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.IconComponent = kClass.js as RClass<P>
    }
    fun Tag.iconComponent(tagName: String) { materialProps.IconComponent = tagName }
}