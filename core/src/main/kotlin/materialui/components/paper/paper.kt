package materialui.components.paper

import kotlinx.html.DIV
import materialui.components.StandardProps
import materialui.components.paper.enums.PaperStyle
import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/Paper")
private external val paperModule: dynamic

external interface PaperProps : StandardProps {
    var elevation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var square: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UnsafeCastFromDynamic")
private val paperComponent: RComponent<PaperProps, RState> = paperModule.default

fun RBuilder.paper(vararg classMap: Pair<PaperStyle, String>, block: MPaperElementBuilder<DIV>.() -> Unit)
    = child(MPaperElementBuilder(paperComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())
