package materialui.components.breadcrumbs

import kotlinx.html.NAV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Breadcrumbs
import materialui.components.StandardProps
import materialui.components.breadcrumbs.enums.BreadcrumbsStyle
import react.*

external interface BreadcrumbsProps : StandardProps {
    val separator: dynamic
    val maxItems: Int?
    val itemsAfterCollapse: Int?
    val itemsBeforeCollapse: Int?
    val expandText: String?
}

fun RBuilder.breadcrumbs(
    vararg classMap: Pair<BreadcrumbsStyle, String>,
    block: BreadcrumbsElementBuilder<NAV>.() -> Unit
) = child(BreadcrumbsElementBuilder(Breadcrumbs, classMap.toList()) { NAV(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.breadcrumbs(
    vararg classMap: Pair<BreadcrumbsStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: BreadcrumbsElementBuilder<T>.() -> Unit
) = child(BreadcrumbsElementBuilder(Breadcrumbs, classMap.toList(), factory).apply(block).create())
