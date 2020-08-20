package materialui.pickers.components.provider

import dateio.core.DateAdapterProvider
import react.FunctionalComponent
import react.RBuilder
import react.RProps

@JsModule("@material-ui/pickers")
@JsNonModule
private external val LocalizationProviderModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val LocalizationProviderComponent: FunctionalComponent<LocalizationProviderProps> = LocalizationProviderModule.LocalizationProvider

external interface LocalizationProviderProps : RProps, DateAdapterProvider

@Suppress("FunctionName")
fun RBuilder.LocalizationProvider(block: LocalizationProviderBuilder.() -> Unit) =
    child(LocalizationProviderBuilder(LocalizationProviderComponent).apply(block).create())
