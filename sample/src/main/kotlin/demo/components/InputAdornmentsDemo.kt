package demo.components

import kotlinx.css.*
import kotlinx.html.DIV
import kotlinx.html.js.onChangeFunction
import materialui.components.formcontrol.formControl
import materialui.components.input.input
import materialui.components.inputadornment.InputAdornmentElementBuilder
import materialui.components.inputadornment.enums.InputAdornmentPosition
import materialui.components.inputlabel.inputLabel
import materialui.components.menuitem.menuItem
import materialui.components.textfield.textField
import materialui.styles.withStyles
import org.w3c.dom.events.Event
import react.*
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledH1

val ranges: List<Pair<String, String>>
    get() = listOf(
        "0-20" to "0 to 20",
        "21-50" to "21 to 50",
        "51-100" to "51 to 100"
    )

class InputAdornmentsDemo : RComponent<RProps, InputAdornmentsState>() {
    override fun InputAdornmentsState.init() {
        amount = ""
        password = ""
        weight = ""
        weightRange = ""
        showPassword = false
    }

    fun handleOnChange(prop: String): (Event) -> Unit = { event ->
        val value = event.target.asDynamic().value
        setState { asDynamic()[prop] = value }
    }

    fun handleClickShowPassword(): () -> Unit = {
        setState { showPassword = !state.showPassword  }
    }

    override fun RBuilder.render() {
        val rootStyle = props.asDynamic()["classes"]["root"] as String
        val marginStyle = props.asDynamic()["classes"]["margin"] as String
        val textFieldStyle = props.asDynamic()["classes"]["textField"] as String

        div {
            styledH1 {
                css.fontWeight = FontWeight.w400

                +"Input Adornments"
            }
        }

        styledDiv {
            css {
                display = Display.flex
                justifyContent = JustifyContent.center
                backgroundColor = Color("#eeeeee")
                boxSizing = BoxSizing.inherit
                padding(24.px)
            }

            div(classes = rootStyle) {
                textField {
                    attrs {
                        id = "simple-start-adornment"
                        label { + "With normal TextField" }
                        classes("$marginStyle $textFieldStyle")
                        inputProps {
                            attrs {
                                startAdornment(startAdornment("Kg"))
                            }
                        }
                    }

                }

                textField {
                    attrs {
                        select = true
                        label { + "With Select" }
                        classes("$marginStyle $textFieldStyle")
                        inputProps {
                            attrs {
                                startAdornment(startAdornment("Kg"))
                            }
                        }
                        value(state.weightRange)
                        onChangeFunction = handleOnChange("weightRange")
                    }
                    ranges.forEach {
                        menuItem {
                            attrs {
                                key = it.first
                                setProp("value", it.second)
                            }
                            +it.first
                        }
                    }
                }

                formControl {
                    attrs {
                        fullWidth = true
                        classes(marginStyle)
                    }
                    inputLabel {
                        attrs {
                            this["htmlFor"] = "adornment-amount"
                        }
                        +"Amount"
                    }
                    input {
                        attrs {
                            id = "adornment-amount"
                            value(state.amount)
                            onChangeFunction = handleOnChange("amount")
                            startAdornment(startAdornment("$"))
                        }
                    }
                }
            }
        }
    }

    private fun startAdornment(unit: String): InputAdornmentElementBuilder<DIV>.() -> Unit = {
            attrs {
                position = InputAdornmentPosition.start
            }
            +unit
        }

    companion object {
        fun render(rBuilder: RBuilder) = with(rBuilder) { styledComponent { } }

        private val styledComponent = withStyles(InputAdornmentsDemo::class, {
            "root" {
                display = Display.flex
                flexWrap = FlexWrap.wrap
                boxSizing = BoxSizing.inherit
            }
            "margin" {
                margin(8.px)
            }
            "withoutLabel" {
                marginTop = 24.px
            }
            "textField" {
                flexBasis = 200.px.basis
            }
        })
    }
}

interface InputAdornmentsState : RState {
    var amount: String
    var password: String
    var weight: String
    var weightRange: String
    var showPassword: Boolean
}
