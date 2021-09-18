package demo.components

import kotlinx.css.*
import materialui.components.appbar.appBar
import materialui.components.appbar.enums.AppBarPosition
import materialui.components.button.button
import materialui.components.button.enums.ButtonColor
import materialui.components.icon.icon
import materialui.components.iconbutton.enums.IconButtonStyle
import materialui.components.iconbutton.iconButton
import materialui.components.toolbar.toolbar
import materialui.components.typography.enums.TypographyColor
import materialui.components.typography.enums.TypographyVariant
import materialui.components.typography.typography
import materialui.styles.withStyles
import react.RBuilder
import react.RComponent
import react.PropsWithChildren
import react.State
import react.dom.attrs
import react.dom.div
import styled.styledH1

class AppbarsDemo : RComponent<PropsWithChildren, State>() {
    override fun RBuilder.render() {
        val rootStyle = props.asDynamic()["classes"]["root"] as String
        val growStyle = props.asDynamic()["classes"]["grow"] as String
        val menuButtonStyle = props.asDynamic()["classes"]["menuButton"] as String

        div {
            styledH1 {
                css.fontWeight = FontWeight.w400

                +"App Bar with buttons"
            }
        }

        div(classes = rootStyle) {
            appBar {
                attrs {
                    position = AppBarPosition.static
                }

                toolbar {
                    iconButton {
                        attrs {
                            classes(IconButtonStyle.root to menuButtonStyle)
                            color = ButtonColor.inherit
                        }

                        icon {
                            +"menu_icon"
                        }
                    }
                    typography {
                        attrs {
                            classes(growStyle)

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

    companion object {

        fun render(rBuilder: RBuilder) = with (rBuilder) { styledComponent { } }

        private val styledComponent = withStyles(AppbarsDemo::class, {
            "root" {
                flexGrow = 1.0
            }
            "grow" {
                flexGrow = 1.0
            }
            "menuButton" {
                marginLeft = (-12).px
                marginRight = 20.px
            }
        })
    }
}
