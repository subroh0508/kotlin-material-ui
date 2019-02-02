package components.badge

import kotlinx.html.SPAN
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Badge")
private external val badgeModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val badgeComponent: RComponent<RProps, RState> = badgeModule.default

fun RBuilder.badge(block: BadgeElementBuilder<SPAN>.() -> Unit)
    = child(BadgeElementBuilder(badgeComponent, SPAN::class) { SPAN(mapOf(), it) }.apply(block).create())
