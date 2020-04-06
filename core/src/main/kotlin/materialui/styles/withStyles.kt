package materialui.styles

import kotlinext.js.js
import materialui.styles.muitheme.MuiTheme
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/styles/withStyles")
private external val withStylesModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val withStyles: (dynamic, dynamic) -> ((Any) -> JsClass<*>) = withStylesModule.default

fun <P: RProps> withStyles(
    rClass: RClass<P>,
    styleSet: StylesSet.() -> Unit,
    withTheme: Boolean = true
): RClass<P> = withStyles(
    { theme: MuiTheme -> StylesBuilder(theme).apply(styleSet).toDynamic() },
    js { this["withTheme"] = withTheme }
)(rClass).unsafeCast<RClass<P>>()

fun <C : RComponent<P, *>, P : RProps> withStyles(
    klazz: KClass<C>,
    styleSet: StylesSet.() -> Unit,
    withTheme: Boolean = false
): RClass<P> = withStyles(klazz.rClass, styleSet, withTheme = withTheme)

fun <P : RProps, C : RComponent<P, *>> RBuilder.childWithStyles(
    klazz: KClass<C>,
    styleSet: StylesSet.() -> Unit,
    withTheme: Boolean = false,
    handler: RHandler<P>
): ReactElement {
    val rClass = withStyles(klazz, styleSet, withTheme = withTheme)

    return rClass(handler)
}

fun <P: RProps> RBuilder.childWithStyles(
    displayName: String,
    styleSet: StylesSet.() -> Unit,
    withTheme: Boolean = false,
    render: RBuilder.(P) -> Unit
): RClass<P> = withStyles(rFunction(displayName, render), styleSet, withTheme = withTheme)
