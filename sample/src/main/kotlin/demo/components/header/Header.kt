package demo.components.header

import demo.components.appsearch.appSearch
import kotlinx.css.*
import kotlinx.css.properties.BoxShadows
import materialui.components.appbar.appBar
import materialui.components.button.enums.ButtonColor
import materialui.components.cssbaseline.cssBaseline
import materialui.components.icon.icon
import materialui.components.iconbutton.iconButton
import materialui.components.toolbar.toolbar
import materialui.components.tooltip.tooltip
import materialui.styles.breakpoint.Breakpoint
import materialui.styles.breakpoint.up
import materialui.styles.transitions.create
import materialui.styles.withStyles
import react.RBuilder
import react.RComponent
import react.RState
import react.dom.attrs
import react.dom.div

class Header : RComponent<HeaderProps, RState>() {
    override fun RBuilder.render() {
        div(props.rootStyle) {
            cssBaseline {  }
            appBar {
                attrs {
                    classes("${props.appBar} ${props.appBarHome}")
                }
                toolbar {
                    iconButton {
                        attrs {
                            color = ButtonColor.inherit
                        }
                        icon {
                            +"menu_icon"
                        }
                    }
                    div(props.classes["grow"] as String) {}
                    appSearch {  }
                    tooltip {
                        attrs {
                            title { + "Change language" }
                            enterDelay = 300
                        }
                        iconButton {
                            attrs {
                                color = ButtonColor.inherit
                            }
                            icon {
                                +"language_icon"
                            }
                        }
                    }
                    tooltip {
                        attrs {
                            title { + "Edit doc colors" }
                            enterDelay = 300
                        }
                        iconButton {
                            attrs {
                                color = ButtonColor.inherit
                            }
                            icon {
                                +"invert_colors_icon"
                            }
                        }

                    }
                    tooltip {
                        attrs {
                            title { + "Toggle light/dark theme" }
                            enterDelay = 300
                        }
                        iconButton {
                            attrs {
                                color = ButtonColor.inherit
                            }
                            icon {
                                +"lightbulb_outline_icon"
                            }
                        }
                    }
                    tooltip {
                        attrs {
                            title { + "Toggle right-to-left/left-to-right" }
                            enterDelay = 300
                        }
                        iconButton {
                            attrs {
                                color = ButtonColor.inherit
                            }
                            icon {
                                +"format_textdirection_l_to_r"
                            }
                        }
                    }
                    tooltip {
                        attrs {
                            title { + "GitHub repository" }
                            enterDelay = 300
                        }
                        iconButton {
                            attrs {
                                color = ButtonColor.inherit
                            }
                            icon {
                                +"GitHub"
                            }
                        }
                    }
                }
            }
        }
    }

    companion object {
        fun render(rBuilder: RBuilder) = with (rBuilder) { styledComponent {} }

        private val styledComponent = withStyles(Header::class, {
            "root" {
                display = Display.flex
            }
            "grow" {
                flex(1.0, 1.0, FlexBasis.auto)
            }
            "title" {
                marginLeft = 24.px
                flex(0.0, 1.0, FlexBasis.auto)
            }
            "appBar" {
                transition = theme.transitions.create("width")
                media("print") {
                    position = Position.absolute
                }
            }
            "appBarHome" {
                boxShadow = BoxShadows.none
            }
            "appBarShift" {
                (theme.breakpoints.up(Breakpoint.lg)) {
                    width = 100.pct - 240.px
                }
            }
            "drawer" {
                (theme.breakpoints.up(Breakpoint.lg)) {
                    width = 240.px
                }
            }
            "navIconHide" {
                (theme.breakpoints.up(Breakpoint.lg)) {
                    display = Display.none
                }
            }
        })
    }
}
