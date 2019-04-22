package materialui.components.dialogtitle

import materialui.components.MaterialElementBuilder
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class DialogTitleElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.disableTypography: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableTypography"]
        set(value) { setProp("disableTypography", value) }
}