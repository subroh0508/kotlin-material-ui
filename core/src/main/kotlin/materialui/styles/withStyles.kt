package materialui.styles

import kotlinext.js.js
import materialui.styles.muitheme.MuiTheme
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/styles/withStyles")
private external val withStylesModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val withStyles: (dynamic, dynamic) -> ((Any) -> JsClass<*>) = withStylesModule.default

fun <P : RProps, C : Component<P, *>> RBuilder.childWithStyles(
    klazz: KClass<C>,
    styleSet: StylesSet.() -> Unit,
    withTheme: Boolean = false,
    handler: RHandler<P>
): ReactElement {
    val rClass = withStyles(
        { theme: MuiTheme -> StylesBuilder(theme).apply(styleSet).toDynamic() },
        js { this["withTheme"] = withTheme }
    )(klazz.js) as RClass<P>

    return rClass(handler)
}

fun <P: RProps> RBuilder.childWithStyles(
    displayName: String,
    styleSet: StylesSet.() -> Unit,
    withTheme: Boolean = false,
    render: RBuilder.(P) -> Unit
): RClass<P> = withStyles(
    { theme: MuiTheme -> StylesBuilder(theme).apply(styleSet).toDynamic() },
    js { this["withTheme"] = withTheme }
)(rFunction(displayName, render)) as RClass<P>
