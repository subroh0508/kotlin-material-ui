package materialui.components.drawer

import materialui.components.StandardProps
import materialui.components.drawer.enums.DrawerStyle
import materialui.styles.muitheme.MuiTheme
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Drawer")
private external val drawerModule: dynamic

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

@Suppress("UnsafeCastFromDynamic")
private val drawerComponent: RClass<DrawerProps> = drawerModule.default

fun RBuilder.drawer(vararg classMap: Pair<DrawerStyle, String>, block: DrawerElementBuilder<DrawerProps>.() -> Unit)
    = child(DrawerElementBuilder(drawerComponent, classMap.toList()).apply(block).create())
