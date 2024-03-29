package materialui.components.rootref

import materialui.RootRef
import react.*

external interface RootRefProps : PropsWithChildren {
    var rootRef: Ref<*>?
}

fun RBuilder.rootRef(block: RootRefElementBuilder.() -> Unit) {
    child(RootRefElementBuilder(RootRef).apply(block).create())
}