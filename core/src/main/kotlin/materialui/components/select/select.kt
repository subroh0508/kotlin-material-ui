package materialui.components.select

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Select")
private external val selectModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val selectComponent: RComponent<RProps, RState> = selectModule.default

fun RBuilder.select(block: SelectElementBuilder.() -> Unit)
    = child(SelectElementBuilder(selectComponent).apply(block).create())
