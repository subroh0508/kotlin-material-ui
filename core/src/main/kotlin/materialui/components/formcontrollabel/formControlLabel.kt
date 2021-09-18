package materialui.components.formcontrollabel

import materialui.FormControlLabel
import materialui.components.StandardProps
import materialui.components.formcontrollabel.enums.FormControlLabelStyle
import org.w3c.dom.events.Event
import react.*

external interface FormControlLabelProps : StandardProps {
    var checked: Any?
    var control: ReactElement?
    var disabled: Boolean?
    var inputRef: Ref<*>?
    var label: ReactElement?
    var labelPlacement: String?
    var name: String?
    var onChange: ((Event, Boolean) -> Unit)?
    var value: String?
}

fun RBuilder.formControlLabel(vararg classMap: Pair<FormControlLabelStyle, String>, block: FormControlLabelElementBuilder.() -> Unit) {
    child(FormControlLabelElementBuilder(FormControlLabel, classMap.toList()).apply(block).create())
}