package components.icon

import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/Icon")
private external val iconModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val iconComponent: RComponent<IconProps, RState> = iconModule.default

fun RBuilder.icon(iconName: String, block: IconElementBuilder.() -> Unit)
    = child(IconElementBuilder(iconName, iconComponent).apply(block).create())
