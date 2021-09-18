package materialui.lab.components.autocomplete

import kotlinext.js.jsObject
import kotlinx.css.Color
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.*
import materialui.components.chip.ChipElementBuilder
import materialui.components.chip.chip
import materialui.components.popper.PopperProps
import materialui.components.textfield.enums.TextFieldSize
import materialui.lab.components.autocomplete.enums.AutocompleteForcePopupIcon
import materialui.lab.components.autocomplete.enums.AutocompleteStyle
import materialui.lab.components.useautocomplete.*
import materialui.lab.components.useautocomplete.enums.AutocompleteBlurOnSelect
import org.w3c.dom.events.Event
import react.*
import kotlin.js.Date
import kotlin.reflect.KClass

class AutocompleteElementBuilder<T: Tag ,O: Any> internal constructor(
    type: ComponentClass<AutocompleteProps<O>>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, AutocompleteProps<O>>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<AutocompleteStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.autoComplete: Boolean? by materialProps
    var Tag.autoHighlight: Boolean? by materialProps
    var Tag.autoSelect: Boolean? by materialProps
    var Tag.clearOnBlur: Boolean? by materialProps
    var Tag.clearOnEscape: Boolean? by materialProps
    var Tag.componentName: String? by materialProps
    var Tag.debug: Boolean? by materialProps
    var Tag.disableClearable: Boolean? by materialProps
    var Tag.disableCloseOnSelect: Boolean? by materialProps
    var Tag.disabledItemsFocusable: Boolean? by materialProps
    var Tag.disableListWrap: Boolean? by materialProps
    var Tag.filterOptions: FilterOptions<O>? by materialProps
    var Tag.filterSelectedOptions: Boolean? by materialProps
    var Tag.freeSolo: Boolean? by materialProps
    var Tag.getOptionDisabled: ((option: O) -> Boolean)? by materialProps
    var Tag.getOptionLabel: ((option: O) -> String)? by materialProps
    var Tag.getOptionSelected: ((option: O, value: O) -> Boolean)? by materialProps
    var Tag.groupBy: ((option: O) -> String)? by materialProps
    var Tag.handleHomeEndKeys: Boolean? by materialProps
    var Tag.id: String? by materialProps
    var Tag.includeInputInList: Boolean? by materialProps
    var Tag.inputValue: String? by materialProps
    var Tag.onClose: ((event: Event, reason: AutocompleteCloseReason) -> Unit)? by materialProps
    var Tag.onInputChange: ((event: Event, value: String, reason: AutocompleteInputChangeReason) -> Unit)? by materialProps
    var Tag.onOpen: ((event: Event) -> Unit)? by materialProps
    var Tag.onHighlightChange: ((event: Event, option: O?, reason: AutocompleteHighlightChangeReason) -> Unit)? by materialProps
    var Tag.open: Boolean? by materialProps
    var Tag.openOnFocus: Boolean? by materialProps
    var Tag.options: Array<O> by materialProps
    var Tag.selectOnFocus: Boolean? by materialProps
    var Tag.multiple: Boolean? by materialProps
    var Tag.value: Any? by materialProps
    var Tag.defaultValue: Any? by materialProps
    var Tag.onChange: ((event: Event, value: dynamic, reason: AutocompleteChangeReason, details: AutocompleteChangeDetails<O>) -> Unit)? by materialProps
    
    var Tag.ChipProps: RProps? by materialProps
    var Tag.closeIcon: ReactElement by materialProps
    var Tag.clearText: String? by materialProps
    var Tag.closeText: String? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.disablePortal: Boolean? by materialProps
    var Tag.fullWidth: Boolean? by materialProps
    var Tag.getLimitTagsText: ((more: Number) -> dynamic)? by materialProps
    var Tag.loading: Boolean? by materialProps
    var Tag.loadingText: ReactElement by materialProps
    var Tag.limitTags: Number? by materialProps
    var Tag.noOptionsText: ReactElement by materialProps
    var Tag.openText: String? by materialProps
    var Tag.popupIcon: ReactElement by materialProps
    var Tag.renderGroup: ((params: AutocompleteRenderGroupParams) -> dynamic)? by materialProps
    var Tag.renderInput: (params: AutocompleteRenderInputParams) -> dynamic by materialProps
    var Tag.renderOption: ((option: T, state: AutocompleteRenderOptionState) -> dynamic)? by materialProps
    var Tag.renderTags: ((value: Array<T>, (Int) -> RProps) -> dynamic)? by materialProps
    var Tag.size: TextFieldSize? // issue: Enum? problem with <reified T: Enum<T>> StandardProps.getValue()
        get() = materialProps.get<TextFieldSize>("size")
        set(value) { materialProps.set("size",value) }

    fun Tag.blurOnSelect(value: AutocompleteBlurOnSelect){
        materialProps.blurOnSelect = when (value.name) {
            "true" -> true
            "false" -> false
            else -> value.toString()
        }
    }
    fun Tag.forcePopupIcon(value: AutocompleteForcePopupIcon){
        materialProps.forcePopupIcon = when (value.name) {
            "true" -> true
            "false" -> false
            else -> value.toString()
        }
    }
    fun Tag.chipProps(block: ChipElementBuilder<DIV>.() -> Unit){
        ChipProps = RBuilder().chip(block = block).props
    }
    fun <T2: Tag> Tag.chipProps(factory: (TagConsumer<Unit>) -> T2,block: ChipElementBuilder<T2>.() -> Unit){
        ChipProps = RBuilder().chip(factory = factory,block = block).props
    }

    fun Tag.closeIcon(block: RBuilder.()->Unit) { closeIcon = buildElement(block) }

    fun <P: RProps> Tag.listBoxComponent(kClass: KClass<out Component<P, *>>) {
        materialProps.ListboxComponent = kClass.react
    }

    fun <P: RProps> Tag.listBoxComponent(fc: FunctionComponent<P>) {
        materialProps.ListboxComponent = fc
    }
    fun Tag.listBoxComponent(tagName: String) {
        materialProps.ListboxComponent = tagName
    }
    fun Tag.listBoxProps(builder: dynamic.()->Unit) {
        materialProps.ListboxProps = jsObject(builder)
    }

    fun Tag.loadingText(block: RBuilder.()->Unit) { loadingText = buildElement(block) }
    fun Tag.noOptionsText(block: RBuilder.()->Unit) { noOptionsText = buildElement(block) }

    fun <P: RProps> Tag.paperComponent(kClass: KClass<out Component<P, *>>) {
        materialProps.PaperComponent = kClass.react
    }

    fun <P: RProps> Tag.paperComponent(fc: FunctionComponent<P>) {
        materialProps.PaperComponent = fc
    }

    fun Tag.paperComponent(tagName: String) {
        materialProps.PaperComponent = tagName
    }
    fun <P: PopperProps> Tag.popperComponent(kClass: KClass<out Component<P, *>>) {
        materialProps.PopperComponent = kClass.react
    }

    fun <P: PopperProps> Tag.popperComponent(fc: FunctionComponent<P>) {
        materialProps.PopperComponent = fc
    }

    fun Tag.popperComponent(tagName: String) {
        materialProps.PopperComponent = tagName
    }

    fun Tag.popupIcon(block: RBuilder.()->Unit) { popupIcon = buildElement(block) }

    fun Tag.value(v: String) { value = v }
    fun Tag.value(v: Number) { value = v }
    fun Tag.value(v: Boolean) { value = v }
    fun Tag.value(v: Date) { value = v }
    fun Tag.value(v: Color) { value = v.toString() }

}