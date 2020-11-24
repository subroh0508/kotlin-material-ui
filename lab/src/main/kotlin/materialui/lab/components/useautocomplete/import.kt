@file:JsModule("@material-ui/lab/useAutocomplete")
@file:JsNonModule

package materialui.lab.components.useautocomplete

@JsName("default")
external fun <T> useAutocomplete(props: UseAutocompleteProps<T>): UseAutocompleteInterface<T>

@JsName("createFilterOptions")
external fun <T> createFilterOptions(config: CreateFilterOptionsConfig<T> = definedExternally): FilterOptions<T>
