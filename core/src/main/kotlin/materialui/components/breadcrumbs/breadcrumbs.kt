package materialui.components.breadcrumbs

import kotlinx.html.NAV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.breadcrumbs.enums.BreadcrumbsStyle
import react.*

@JsModule("@material-ui/core/Breadcrumbs")
private external val breadcrumbsModule: dynamic

external interface BreadcrumbsProps : StandardProps {
    val separator: dynamic
    val maxItems: Int?
    val itemsAfterCollapse: Int?
    val itemsBeforeCollapse: Int?
    val expandText: String?
}

@Suppress("UnsafeCastFromDynamic")
private val breadcrumbsComponent: RClass<BreadcrumbsProps> = breadcrumbsModule.default

fun RBuilder.breadcrumbs(
    vararg classMap: Pair<BreadcrumbsStyle, String>,
    block: BreadcrumbsElementBuilder<NAV>.() -> Unit
) = child(BreadcrumbsElementBuilder(breadcrumbsComponent, classMap.toList()) { NAV(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.breadcrumbs(
    vararg classMap: Pair<BreadcrumbsStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: BreadcrumbsElementBuilder<T>.() -> Unit
) = child(BreadcrumbsElementBuilder(breadcrumbsComponent, classMap.toList(), factory).apply(block).create())
