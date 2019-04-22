package materialui.styles

import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.css.CSSBuilder
import materialui.components.MaterialElementStyles
import materialui.styles.muitheme.MuiTheme
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/styles/withStyles")
private external val withStylesModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val withStyles: (dynamic, dynamic) -> ((Any) -> JsClass<*>) = withStylesModule.default

private val MaterialElementStyles.toDynamic: Any
    get() = js {
        forEach { (key, value) ->
            this[key] = value.toDynamic
        }
    } as Any

private val CSSBuilder.toDynamic: Any
    get() = js {
        declarations.forEach { (key, value) ->
            this[key] = value.toString()
        }
    } as Any

fun <P : RProps, C : Component<P, *>> RBuilder.childWithStyles(
    klazz: KClass<C>,
    styles: (MuiTheme) -> MaterialElementStyles,
    handler: RHandler<P>
): ReactElement {
    val rClass = withStyles({ theme: Any -> styles(MuiTheme(theme)).toDynamic }, jsObject { })(klazz.js) as RClass<P>
    return rClass(handler)
}

fun <P : RProps, C : Component<P, *>> RBuilder.childWithStyles(
    klazz: KClass<C>,
    vararg styles: Pair<String, (MuiTheme) -> CSSBuilder>,
    handler: RHandler<P>
) = childWithStyles(
    klazz,
    { theme: MuiTheme -> styles.map { it.first to it.second(theme) }.toMap() },
    handler
)

fun <P : RProps, C : Component<P, *>> RBuilder.childWithStyles(
    klazz: KClass<C>,
    styles: MaterialElementStyles,
    withTheme: Boolean = false,
    handler: RHandler<P>
): ReactElement {
    val rClass = withStyles(styles.toDynamic, js { this["withTheme"] = withTheme })(klazz.js) as RClass<P>
    return rClass(handler)
}

fun <P : RProps, C : Component<P, *>> RBuilder.childWithStyles(
    klazz: KClass<C>,
    vararg styles: Pair<String, CSSBuilder>,
    withTheme: Boolean = false,
    handler: RHandler<P>
) = childWithStyles(klazz, styles.map { it.first to it.second }.toMap(), withTheme, handler)
