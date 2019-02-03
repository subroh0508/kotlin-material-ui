package components.listitemtext

import components.MaterialElementBuilder
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class ListItemTextElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.disableTypography: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableTypography"]
        set(value) { setProp("disableTypography", value) }
    var Tag.inset: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inset"]
        set(value) { setProp("inset", value) }
    var Tag.primary: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["primary"]
        set(value) { setProp("primary", value) }
    var Tag.primaryTypographyProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["primaryTypographyProps"]
        set(value) { setProp("primaryTypographyProps", value) }
    var Tag.secondary: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["secondary"]
        set(value) { setProp("secondary", value) }
    var Tag.secondaryTypographyProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["secondaryTypographyProps"]
        set(value) { setProp("secondaryTypographyProps", value) }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { setProp("theme", value) }
}