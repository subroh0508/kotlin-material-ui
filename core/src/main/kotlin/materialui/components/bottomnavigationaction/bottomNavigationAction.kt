package materialui.components.bottomnavigationaction

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.buttonbase.enums.ButtonBaseStyle
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/BottomNavigationAction")
private external val bottomNavigationActionModule: dynamic

external interface BottomNavigationActionProps : ButtonBaseProps {
    var icon: ReactElement?
    var label: ReactElement?
    var selected: Boolean?
    var showLabel: Boolean?
    var value: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val bottomNavigationActionComponent: RClass<BottomNavigationActionProps> = bottomNavigationActionModule.default

fun RBuilder.bottomNavigationAction(vararg classMap: Pair<ButtonBaseStyle, String>, block: BottomNavigationActionElementBuilder<BUTTON>.() -> Unit)
    = child(BottomNavigationActionElementBuilder(bottomNavigationActionComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.bottomNavigationAction(vararg classMap: Pair<ButtonBaseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: BottomNavigationActionElementBuilder<T>.() -> Unit)
    = child(BottomNavigationActionElementBuilder(bottomNavigationActionComponent, classMap.toList(), factory).apply(block).create())
