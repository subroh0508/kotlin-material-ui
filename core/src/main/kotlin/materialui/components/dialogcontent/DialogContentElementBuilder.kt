package materialui.components.dialogcontent

import materialui.components.MaterialElementBuilder
import kotlinx.html.DIV
import react.RComponent
import react.RProps
import react.RState

class DialogContentElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
}