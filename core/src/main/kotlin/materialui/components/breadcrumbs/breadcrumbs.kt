package materialui.components.breadcrumbs

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.toolbar.enums.ToolbarStyle
import react.*

@JsModule("@material-ui/core/Breadcrumbs")
private external val breadcrumbsModule: dynamic

external interface BreadcrumbsProps : StandardProps {
    val separator: String
    val maxItems: Int
    val itemsAfterCollapse: Int
    val itemsBeforeCollapse: Int
}

@Suppress("UnsafeCastFromDynamic")
private val breadcrumbsComponent: RClass<BreadcrumbsProps> = breadcrumbsModule.default

fun RBuilder.breadcrumbs(
    vararg classMap: Pair<ToolbarStyle, String>,
    block: BreadcrumbsElementBuilder<DIV>.() -> Unit
) = child(BreadcrumbsElementBuilder(breadcrumbsComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.breadcrumbs(
    vararg classMap: Pair<ToolbarStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: BreadcrumbsElementBuilder<T>.() -> Unit
) = child(BreadcrumbsElementBuilder(breadcrumbsComponent, classMap.toList(), factory).apply(block).create())
