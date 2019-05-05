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
import materialui.styles.childWithStyles
import materialui.styles.muitheme.MuiTheme
import materialui.styles.transitions.create
import react.RBuilder
import react.RComponent
import react.RState
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
        fun render(rBuilder: RBuilder) = rBuilder.childWithStyles(
            Header::class,
            "root" to root,
            "grow" to grow,
            "title" to title,
            "appBart" to appBar,
            "appBarHome" to appBarHome,
            "appBarShift" to appBarShift,
            "drawer" to drawer,
            "navIconHide" to navIconHide
        ) { }

        private val root = { theme: MuiTheme ->
            CSSBuilder().apply {
                display = Display.flex
            }
        }

        private val grow = { theme: MuiTheme ->
            CSSBuilder().apply {
                flex(1.0, 1.0, FlexBasis.auto)
            }
        }

        private val title = { theme: MuiTheme ->
            CSSBuilder().apply {
                marginLeft = 24.px
                flex(0.0, 1.0, FlexBasis.auto)
            }
        }

        private val appBar = { theme: MuiTheme ->
            CSSBuilder().apply {
                transition = theme.transitions.create("width")
                media("print") {
                    position = Position.absolute
                }
            }
        }

        private val appBarHome = { theme: MuiTheme ->
            CSSBuilder().apply {
                boxShadow = BoxShadows.none
            }
        }

        private val appBarShift = { theme: MuiTheme ->
            CSSBuilder().apply {
                theme.breakpoints.up(Breakpoint.lg).invoke {
                    width = 100.pct - 240.px
                }
            }
        }

        private val drawer = { theme: MuiTheme ->
            CSSBuilder().apply {
                theme.breakpoints.up(Breakpoint.lg).invoke {
                    width = 240.px
                }
            }
        }

        private val navIconHide = { theme: MuiTheme ->
            CSSBuilder().apply {
                theme.breakpoints.up(Breakpoint.lg).invoke {
                    display = Display.none
                }
            }
        }
    }
}
