package materialui.components.drawer

import materialui.Drawer
import materialui.components.StandardProps
import materialui.components.drawer.enums.DrawerStyle
import materialui.styles.muitheme.MuiTheme
import org.w3c.dom.events.Event
import react.RBuilder
import react.PropsWithChildren

external interface DrawerProps : StandardProps {
    var anchor: String?
    var BackdropProps: RProps?
    var elevation: Number?
    var ModalProps: RProps?
    var onClose: ((Event) -> Unit)?
    var open: Boolean?
    var PaperProps: RProps?
    var SlideProps: RProps?
    var theme: MuiTheme?
    var transitionDuration: dynamic
    var variant: String?
}

fun RBuilder.drawer(vararg classMap: Pair<DrawerStyle, String>, block: DrawerElementBuilder<DrawerProps>.() -> Unit)
    = child(DrawerElementBuilder(Drawer, classMap.toList()).apply(block).create())
