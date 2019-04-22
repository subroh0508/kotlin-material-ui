package materialui.components.listsubheader

import kotlinx.html.LI
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/ListSubheader")
private external val listSubheaderModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listSubheaderComponent: RComponent<RProps, RState> = listSubheaderModule.default

fun RBuilder.listSubheader(block: ListSubheaderElementBuilder<LI>.() -> Unit)
    = child(ListSubheaderElementBuilder(listSubheaderComponent, LI::class) { LI(mapOf(), it) }.apply(block).create())