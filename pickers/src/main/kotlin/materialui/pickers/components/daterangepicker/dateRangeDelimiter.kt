package materialui.pickers.components.daterangepicker

import kotlinx.html.*
import materialui.components.typography.TypographyElementBuilder
import materialui.components.typography.TypographyProps
import materialui.components.typography.enums.TypographyStyle
import react.ComponentType
import react.RBuilder


@JsModule("@material-ui/pickers")
@JsNonModule
private external val DateRangeDelimiterModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val DateRangeDelimiterComponent: ComponentType<TypographyProps> = DateRangeDelimiterModule.DateRangeDelimiter

fun RBuilder.dateRangeDelimiter(vararg classMap: Pair<TypographyStyle, String>, block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit) =
    child(TypographyElementBuilder(DateRangeDelimiterComponent, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun RBuilder.dateRangeDelimiter(vararg classMap: Pair<TypographyStyle, String>, p: Boolean, block: TypographyElementBuilder<P, TypographyProps>.() -> Unit) =
    child(TypographyElementBuilder(DateRangeDelimiterComponent, classMap.toList()) { P(mapOf(), it) }.apply {
        attrs.paragraph = p
        block()
    }.create())

fun <T: Tag> RBuilder.dateRangeDelimiter(vararg classMap: Pair<TypographyStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TypographyElementBuilder<T, TypographyProps>.() -> Unit) =
    child(TypographyElementBuilder(DateRangeDelimiterComponent, classMap.toList(), factory).apply(block).create())
