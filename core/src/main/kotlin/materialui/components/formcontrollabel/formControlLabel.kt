package materialui.components.formcontrollabel

import materialui.components.StandardProps
import materialui.components.formcontrollabel.enums.FormControlLabelStyle
import org.w3c.dom.events.Event
import react.*

@JsModule("@material-ui/core/FormControlLabel")
private external val formControlLabelModule: dynamic

external interface FormControlLabelProps : StandardProps {
    var checked: Any?
    var control: ReactElement?
    var disabled: Boolean?
    var inputRef: RRef?
    var label: ReactElement?
    var labelPlacement: String?
    var name: String?
    var onChange: ((Event, Boolean) -> Unit)?
    var value: String?
}

@Suppress("UnsafeCastFromDynamic")
private val formControlLabelComponent: RClass<FormControlLabelProps> = formControlLabelModule.default

fun RBuilder.formControlLabel(vararg classMap: Pair<FormControlLabelStyle, String>, block: FormControlLabelElementBuilder.() -> Unit)
    = child(FormControlLabelElementBuilder(formControlLabelComponent, classMap.toList()).apply(block).create())
