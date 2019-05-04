package demo.components

import kotlinx.css.*
import kotlinx.html.InputType
import kotlinx.html.SPAN
import kotlinx.html.id
import materialui.components.button.button
import materialui.components.button.enums.ButtonColor
import materialui.components.button.enums.ButtonStyle
import materialui.components.button.enums.ButtonVariant
import materialui.styles.childWithStyles
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import styled.css
import styled.styledDiv

class ButtonsDemo : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        val buttonStyle = props.asDynamic()["classes"]["button"] as String
        val inputStyle = props.asDynamic()["classes"]["input"] as String

        div {
            h2 {
                +"Contained Buttons"
                a {
                    attrs {
                        href = "#contained-buttons"
                    }
                }
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
                button {
                    attrs {
                        variant = ButtonVariant.contained
                        classes(ButtonStyle.root to buttonStyle)
                    }

                    +"Default"
                }
                button {
                    attrs {
                        variant = ButtonVariant.contained
                        color = ButtonColor.primary
                        classes(ButtonStyle.root to buttonStyle)
                    }

                    +"Primary"
                }
                button {
                    attrs {
                        variant = ButtonVariant.contained
                        color = ButtonColor.secondary
                        classes(ButtonStyle.root to buttonStyle)
                    }

                    +"Secondary"
                }
                button {
                    attrs {
                        variant = ButtonVariant.contained
                        color = ButtonColor.secondary
                        disabled = true
                        classes(ButtonStyle.root to buttonStyle)
                    }

                    +"Disabled"
                }
                button {
                    attrs {
                        variant = ButtonVariant.contained
                        href = "#contained-buttons"
                        classes(ButtonStyle.root to buttonStyle)
                    }

                    +"Link"
                }
                input(classes = inputStyle) {
                    attrs {
                        accept = "image/*"
                        id = "contained-button-file"
                        multiple = true
                        type = InputType.file
                    }
                }
                label {
                    setProp("htmlFor", "contained-button-file")

                    button(factory = { SPAN(mapOf(), it) }, block = {
                        attrs {
                            variant = ButtonVariant.contained
                            classes(ButtonStyle.root to buttonStyle)
                        }

                        +"Upload"
                    })
                }
            }
        }
    }

    companion object {
        fun render(rBuilder: RBuilder) = rBuilder.childWithStyles(
            ButtonsDemo::class,
            "button" to button,
            "input" to input
        ) { }

        private val button = { theme: MuiTheme ->
            CSSBuilder().apply {
                margin(theme.spacing.unit.px)
            }
        }

        private val input = { _: MuiTheme ->
            CSSBuilder().apply {
                display = Display.none
            }
        }
    }
}