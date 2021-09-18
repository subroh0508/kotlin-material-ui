package materialui.lab.components.autocomplete

import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.textfield.TextFieldProps
import materialui.lab.components.autocomplete.enums.AutocompleteStyle
import materialui.lab.components.useautocomplete.UseAutocompleteProps
import react.*

@JsModule("@material-ui/lab/Autocomplete")
@JsNonModule
private external val autocompleteModule: dynamic

typealias ReactNode = Any? /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean */

external interface AutocompleteProps<T> : UseAutocompleteProps<T>, StandardProps {
    var ChipProps: Any?
    var closeIcon: ReactNode
    var clearText: String?
    var closeText: String?
    var disabled: Boolean?
    var disablePortal: Boolean?
    var forcePopupIcon: dynamic /* Boolean? | String */
    var fullWidth: Boolean?
    var getLimitTagsText: ((more: Number) -> dynamic)?
    var ListboxComponent: dynamic
    var ListboxProps: dynamic
    var loading: Boolean?
    var loadingText: ReactNode
    var limitTags: Number?
    var noOptionsText: ReactNode
    var openText: String?
    var PaperComponent: dynamic
    var PopperComponent: dynamic
    var popupIcon: dynamic
    var renderGroup: ((params: AutocompleteRenderGroupParams) -> dynamic)?
    var renderInput: (params: AutocompleteRenderInputParams) -> dynamic
    var renderOption: ((option: T, state: AutocompleteRenderOptionState) -> dynamic)?
    var renderTags: ((value: Array<T>, (Int) -> RProps) -> dynamic)?
    var size: String? /* 'small' | 'medium' */
}

external interface AutocompleteRenderGroupParams {
    var key: String
    var group: String
    var children: ReactNode
}

external interface AutocompleteRenderInputParams {
    var id: String
    var disabled: Boolean
    var fullWidth: Boolean
    var size: String?
    var InputLabelProps: PropsWithChildren?
    var InputProps: AutocompleteInputProps
    var inputProps: RProps
}

external interface AutocompleteInputProps: RProps{
    val ref: Ref<*>
    var className: String
    var startAdornment: ReactElement
    var endAdornment: ReactElement
}

external interface AutocompleteRenderOptionState {
    var inputValue: String
    var selected: Boolean
}

@Suppress("UnsafeCastFromDynamic")
private val autocompleteComponent: ComponentClass<AutocompleteProps<*>> = autocompleteModule.default

fun <O: Any> RBuilder.autoComplete(vararg classMap: Pair<AutocompleteStyle, String>, block: AutocompleteElementBuilder<DIV ,O>.() -> Unit)
        = child(AutocompleteElementBuilder<DIV ,O>(autocompleteComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag, O: Any> RBuilder.autoComplete(vararg classMap: Pair<AutocompleteStyle, String>, factory: (TagConsumer<Unit>) -> T, block: AutocompleteElementBuilder<T ,O>.() -> Unit)
        = child(AutocompleteElementBuilder<T ,O>(autocompleteComponent, classMap.toList(), factory).apply(block).create())

fun AutocompleteRenderInputParams.getTextFieldProps():TextFieldProps =
    Object.assign(jsObject {},this)
