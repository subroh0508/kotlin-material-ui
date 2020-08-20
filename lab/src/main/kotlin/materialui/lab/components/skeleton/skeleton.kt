package materialui.lab.components.skeleton

import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.lab.components.skeleton.enums.SkeletonStyle
import materialui.components.buttonbase.ButtonBaseProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/lab/Skeleton")
@JsNonModule
private external val skeletonModule: dynamic

external interface SkeletonProps : ButtonBaseProps {
    var animation: String?
    var height: dynamic
    var variant: String?
    var width: dynamic
}

@Suppress("UnsafeCastFromDynamic")
private val skeletonComponent: RClass<SkeletonProps> = skeletonModule.default

fun RBuilder.skeleton(vararg classMap: Pair<SkeletonStyle, String>, block: SkeletonElementBuilder<SPAN>.() -> Unit)
    = child(SkeletonElementBuilder(skeletonComponent, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.skeleton(vararg classMap: Pair<SkeletonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: SkeletonElementBuilder<T>.() -> Unit)
    = child(SkeletonElementBuilder(skeletonComponent, classMap.toList(), factory).apply(block).create())

