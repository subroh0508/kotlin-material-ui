package materialui.components.typography

import kotlinx.html.P
import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.typography.enums.TypographyStyle
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Typography")
private external val typographyModule: dynamic

external interface TypographyProps : StandardProps {
    var align: String?
    var color: String?
    var gutterBottom: Boolean?
    var headlineMapping: String?
    var inline: Boolean?
    var internalDeprecatedVariant: Boolean?
    var noWrap: Boolean?
    var paragraph: Boolean?
    var theme: MuiTheme?
    var variant: String?
}

external interface HeadlineMapping {
    var h1: String?
    var h2: String?
    var h3: String?
    var h4: String?
    var h5: String?
    var h6: String?
    var subtitle1: String?
    var subtitle2: String?
    var body1: String?
    var body2: String?
    var display4: String?
    var display3: String?
    var display2: String?
    var display1: String?
    var headline: String?
    var title: String?
    var subheading: String?
}

@Suppress("UnsafeCastFromDynamic")
private val typographyComponent: RClass<TypographyProps> = typographyModule.default

fun RBuilder.typography(vararg classMap: Pair<TypographyStyle, String>, block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit)
    = child(TypographyElementBuilder(typographyComponent, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun RBuilder.typography(vararg classMap: Pair<TypographyStyle, String>, p: Boolean, block: TypographyElementBuilder<P, TypographyProps>.() -> Unit)
    = child(TypographyElementBuilder(typographyComponent, classMap.toList()) { P(mapOf(), it) }.apply {
        attrs.paragraph = p
        block()
    }.create())

fun <T: Tag> RBuilder.typography(vararg classMap: Pair<TypographyStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TypographyElementBuilder<T, TypographyProps>.() -> Unit)
     = child(TypographyElementBuilder(typographyComponent, classMap.toList(), factory).apply(block).create())
