package materialui.lab.components.useautocomplete

import kotlinext.js.jsObject
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.RProps

external interface UseAutocompleteProps<T>: RProps {
    var autoComplete: Boolean?
    var autoHighlight: Boolean?
    var autoSelect: Boolean?
    var blurOnSelect: dynamic /* 'touch' | 'mouse' | Boolean */
    var clearOnBlur: Boolean?
    var clearOnEscape: Boolean?
    var componentName: String?
    var debug: Boolean?
    var disableClearable: Boolean?
    var disableCloseOnSelect: Boolean?
    var disabledItemsFocusable: Boolean?
    var disableListWrap: Boolean?
    var filterOptions: FilterOptions<T>?
    var filterSelectedOptions: Boolean?
    var freeSolo: Boolean?
    var getOptionDisabled: ((option: T) -> Boolean)?
    var getOptionLabel: ((option: T) -> String)?
    var getOptionSelected: ((option: T, value: T) -> Boolean)?
    var groupBy: ((option: T) -> String)?
    var handleHomeEndKeys: Boolean?
    var id: String?
    var includeInputInList: Boolean?
    var inputValue: String?
    var onClose: ((event: Event, reason: AutocompleteCloseReason) -> Unit)?
    var onInputChange: ((event: Event, value: String, reason: AutocompleteInputChangeReason) -> Unit)?
    var onOpen: ((event: Event) -> Unit)?
    var onHighlightChange: ((event: Event, option: T?, reason: AutocompleteHighlightChangeReason) -> Unit)?
    var open: Boolean?
    var openOnFocus: Boolean?
    var options: Array<T>
    var selectOnFocus: Boolean?
    var multiple: Boolean?
    var value: dynamic
    var defaultValue: dynamic
    var onChange: ((event: Event, value: dynamic, reason: AutocompleteChangeReason, details: AutocompleteChangeDetails<T>) -> Unit)?
}

typealias AutocompleteChangeReason = String /* 'create-option' | 'select-option' | 'remove-option' | 'clear' | 'blur' */
typealias AutocompleteCloseReason = String /* 'toggleInput' | 'escape' | 'select-option' | 'blur' */
typealias AutocompleteInputChangeReason = String /* 'input' | 'reset' | 'clear' */
typealias AutocompleteHighlightChangeReason = String /* 'keyboard' | 'mouse' | 'auto' */

external interface AutocompleteChangeDetails<T> {
    var option: T
}

external interface FilterOptionsState<T> {
    var inputValue: String
    var getOptionLabel: (option: T) -> String
}

typealias FilterOptions<T> = (options: Array<T>, state: FilterOptionsState<T>) -> Array<T>

external interface CreateFilterOptionsConfig<T> {
    var ignoreAccents: Boolean?
    var ignoreCase: Boolean?
    var limit: Number?
    var matchFrom: String?// 'any' | 'start';
    var stringify: ((option: T) -> String)?
    var trim: Boolean?
}

external interface GetTagPropsParams {
    var index: Number
}

external interface GetOptionPropsParams<T> {
    var option: T
    var index: Number
}

external interface UseAutocompleteInterface<T> {
    fun getRootProps(): RProps
    fun getInputProps(): RProps
    fun getInputLabelProps(): RProps
    fun getClearProps(): RProps
    fun getPopupIndicatorProps(): RProps
    fun getTagProps(params: GetTagPropsParams): RProps
    fun getListboxProps(): RProps
    fun getOptionProps(params: GetOptionPropsParams<T>): RProps
    val id: String
    val inputValue: String
    val value: dynamic
    val dirty: Boolean
    val popupOpen: Boolean
    val focused: Boolean
    val anchorEl: HTMLElement?
    fun setAnchorEl()
    val focusedTag: Int
    val groupedOptions: Array<T>
}

fun UseAutocompleteInterface<*>.getTagProps(index: Int){
    this.getTagProps(jsObject {
        this.index = index
    })
}

fun <T> UseAutocompleteInterface<T>.getOptionProps(option: T, index: Int){
    this.getOptionProps(jsObject {
            this.option = option
            this.index = index
        }
    )
}

fun <T> useAutocomplete(builder: UseAutocompleteProps<T>.() -> Unit):UseAutocompleteInterface<T>{
    return useAutocomplete(jsObject<UseAutocompleteProps<T>>().apply(builder))
}

/*
fun <T> useAutoComplete(builder: UseAutocompletePropsBuilder<T>.()->Unit){
    useAutocomplete(UseAutocompletePropsBuilder<T>().apply(builder).build())
}
*/
