package styles

import react.ReactElement

@JsModule("@material-ui/core/styles/withStyles")
private external val withStylesModule: dynamic

@Suppress("UnsafeCastFromDynamic")
internal val withStyles: (dynamic) -> ((Any) -> ReactElement) = withStylesModule.default
