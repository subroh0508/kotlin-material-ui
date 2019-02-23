package demo.components.header

import components.appbar.appBar
import components.button.enums.ButtonColor
import components.cssbaseline.cssBaseline
import components.icon.icon
import components.iconbutton.iconButton
import components.toolbar.toolbar
import components.tooltip.tooltip
import demo.components.appsearch.AppSearch
import kotlinx.css.*
import kotlinx.css.properties.BoxShadows
import react.RBuilder
import react.RComponent
import react.RState
import react.dom.div
import styles.childWithStyles
import styles.muitheme.MuiTheme
import styles.muitheme.create
import styles.muitheme.up

class Header : RComponent<HeaderProps, RState>() {
    override fun RBuilder.render() {
        console.log(props.classes)
        div(props.rootStyle) {
            cssBaseline {  }
            appBar {
                attrs {
                   rootClass("${props.appBar} ${props.appBarHome}")
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
                    child(AppSearch::class) { }
                    tooltip {
                        attrs {
                            title = "Change language"
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
                            title = "Edit doc colors"
                            enterDelay = 300
                        }
                        iconButton {
                            attrs {
                                color = ButtonColor.inherit
                            }
                            icon {
                                +"colors_icon"
                            }
                        }

                    }
                    tooltip {
                        attrs {
                            title = "Toggle light/dark theme"
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
                            title = "Toggle right-to-left/left-to-right"
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
                            title = "GitHub repository"
                            enterDelay = 300
                        }
                        iconButton {
                            attrs {
                                color = ButtonColor.inherit
                            }
                            icon {
                                +"github_icon"
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
                theme.breakpoints.up("lg").invoke {
                    width = 100.pct - 240.px
                }
            }
        }

        private val drawer = { theme: MuiTheme ->
            CSSBuilder().apply {
                theme.breakpoints.up("lg").invoke {
                    width = 240.px
                }
            }
        }

        private val navIconHide = { theme: MuiTheme ->
            CSSBuilder().apply {
                theme.breakpoints.up("lg").invoke {
                    display = Display.none
                }
            }
        }
    }
}
