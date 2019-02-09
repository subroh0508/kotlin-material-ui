package demo.components

import components.appbar.appBar
import components.appbar.enums.AppBarPosition
import components.button.button
import components.button.enums.ButtonColor
import components.icon.icon
import components.iconbutton.iconButton
import components.toolbar.toolbar
import components.typography.enums.TypographyColor
import components.typography.enums.TypographyVariant
import components.typography.typography
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h2
import styled.css
import styled.styledDiv

class AppbarsDemo : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        console.log(props)
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
                            classes {
                                rootStyle {
                                    marginLeft = (-12).px
                                    marginRight = 20.px
                                }
                            }
                            color = ButtonColor.inherit
                        }

                        icon {
                            +"menu_icon"
                        }
                    }
                    typography {
                        attrs {
                            classes {
                                rootStyle {
                                    flexGrow = 1.0
                                }
                            }

                            variant = TypographyVariant.h6
                            color = TypographyColor.inherit
                        }
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