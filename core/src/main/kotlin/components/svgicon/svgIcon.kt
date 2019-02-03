package components.svgicon

import kotlinx.html.SVG
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/SvgIcon")
private external val svgIconModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val svgIconComponent: RComponent<RProps, RState> = svgIconModule.default

fun RBuilder.svgIcon(block: SvgIconElementBuilder<SVG>.() -> Unit)
    = child(SvgIconElementBuilder(svgIconComponent, SVG::class) { SVG(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.svgIcon(tag: KClass<T>, block: SvgIconElementBuilder<T>.() -> Unit)
    = child(SvgIconElementBuilder(svgIconComponent, tag).apply(block).create())
