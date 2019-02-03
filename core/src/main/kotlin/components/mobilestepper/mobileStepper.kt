package components.mobilestepper

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/MobileStepper")
private external val mobileStepperModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val mobileStepperComponent: RComponent<RProps, RState> = mobileStepperModule.default

fun RBuilder.mobileStepper(block: MobileStepperElementBuilder<DIV>.() -> Unit)
    = child(MobileStepperElementBuilder(mobileStepperComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.mobileStepper(tag: KClass<T>, block: MobileStepperElementBuilder<T>.() -> Unit)
    = child(MobileStepperElementBuilder(mobileStepperComponent, tag).apply(block).create())
