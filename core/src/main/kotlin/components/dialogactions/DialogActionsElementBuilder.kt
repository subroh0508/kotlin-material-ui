package components.dialogactions

import components.MaterialElementBuilder
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class DialogActionsElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.disableActionSpacing: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableActionSpacing"]
        set(value) { setProp("disableActionSpacing", value) }
}