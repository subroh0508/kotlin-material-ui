package test.components

import components.appbar.appBar
import components.appbar.enums.AppBarPosition
import components.button.button
import components.button.enums.ButtonColor
import components.iconbutton.iconButton
import components.toolbar.toolbar
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h2
import react.dom.h6
import styled.css
import styled.styledDiv

class AppbarsDemo : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            h2 {
                +"App Bar with buttons"
            }
        }

        styledDiv {
            css {
                flexGrow = 1.0
            }

            appBar {
                attrs {
                    position = AppBarPosition.static
                }

                toolbar {
                    iconButton {
                        attrs {
                            color = ButtonColor.inherit

                        }
                    }
                    h6 {
                        +"News"
                    }
                    button {
                        attrs {
                            color = ButtonColor.inherit
                        }
                        +"Login"
                    }
                }
            }
        }
    }
}