package materialui.components.drawer

import materialui.components.MaterialElementBuilder
import materialui.components.drawer.enums.DrawerAnchor
import materialui.components.drawer.enums.DrawerVariant
import materialui.components.drawer.values.TransitionDuration
import kotlinx.html.DIV
import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState

open class DrawerElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.anchor: DrawerAnchor
        get() = DrawerAnchor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["anchor"])
        set(value) { setProp("anchor", value.toString()) }
    var Tag.backdropProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["BackdropProps"]
        set(value) { setProp("BackdropProps", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.elevation: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["elevation"]
        set(value) { setProp("elevation", value) }
    var Tag.modalProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["ModalProps"]
        set(value) { setProp("ModalProps", value) }
    var Tag.onClose: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onClose"]
        set(value) { setProp("onClose", value) }
    var Tag.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { setProp("open", value) }
    var Tag.paperProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["PaperProps"]
        set(value) { setProp("PaperProps", value) }
    var Tag.slideProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["SlideProps"]
        set(value) { setProp("SlideProps", value) }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { setProp("theme", value) }
    var Tag.transitionDuration: TransitionDuration
        get() = TransitionDuration.fromDynamic(props.asDynamic()["transitionDuration"])
        set(value) { setProp("transitionDuration", value.value) }
    var Tag.variant: DrawerVariant
        get() = DrawerVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}