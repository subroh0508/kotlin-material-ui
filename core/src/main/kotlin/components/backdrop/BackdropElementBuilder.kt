package components.backdrop

import components.backdrop.values.TransitionDuration
import react.RComponent
import react.RProps
import react.RState
import reacttransiton.RTransitionBuilder

class BackdropElementBuilder(
    type: RComponent<RProps, RState>
) : RTransitionBuilder(type) {

    var RProps.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { props.asDynamic()["classes"] = value }
    var RProps.invisible: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["invisible"]
        set(value) { props.asDynamic()["invisible"] = value }
    var RProps.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { props.asDynamic()["open"] = value }
    var RProps.transitionDuration: TransitionDuration
        get() = TransitionDuration.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["transitionDuration"])
        set(value) { props.asDynamic()["transitionDuration"] = value.value }
}