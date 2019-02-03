package components.popper

import components.MaterialElementBuilder
import components.popper.enums.PopperPlacement
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class PopperElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.anchorEl: ReactElement?
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["anchorEl"]
        set(value) { setProp("anchorEl", value) }
    var Tag.container: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["container"]
        set(value) { setProp("container", value) }
    var Tag.disablePortal: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disablePortal"]
        set(value) { setProp("disablePortal", value) }
    var Tag.keepMounted: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["keepMounted"]
        set(value) { setProp("keepMounted", value) }
    var Tag.modifiers: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["modifiers"]
        set(value) { setProp("modifiers", value) }
    var Tag.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { setProp("open", value) }
    var Tag.placement: PopperPlacement
        get() = PopperPlacement.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["placement"])
        set(value) { setProp("placement", value.value) }
    var Tag.popperOptions: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["popperOptions"]
        set(value) { setProp("popperOptions", value) }
    var Tag.transition: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["transition"]
        set(value) { setProp("transition", value) }
}