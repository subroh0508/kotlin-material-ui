package test.components

import components.button.button
import components.button.enums.ButtonColor
import components.button.enums.ButtonVariant
import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h2
import styled.css
import styled.styledDiv

class ButtonsDemo : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            h2 {
                +"Contained Buttons"
            }
            attrs {

            }
        }

        styledDiv {
            css {
                display = Display.flex
                justifyContent = JustifyContent.center
                backgroundColor = Color("#eeeeee")
                padding(48.px, 24.px, 24.px, 24.px)
            }

            styledDiv {
                css {
                    child("button") {
                        margin(8.px)
                    }
                }

                button("Default") {
                    variant = ButtonVariant.contained
                }
                button("Primary") {
                    variant = ButtonVariant.contained
                    color = ButtonColor.primary
                }
                button("Secondary") {
                    variant = ButtonVariant.contained
                    color = ButtonColor.secondary
                }
                button("Disabled") {
                    variant = ButtonVariant.contained
                    color = ButtonColor.secondary
                    disabled = true
                }
            }
        }
    }
}