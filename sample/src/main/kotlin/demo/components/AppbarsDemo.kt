package demo.components

import kotlinx.css.CSSBuilder
import kotlinx.css.px
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
import materialui.styles.childWithStyles
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h2

class AppbarsDemo : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        val rootStyle = props.asDynamic()["classes"]["root"] as String
        val growStyle = props.asDynamic()["classes"]["grow"] as String
        val menuButtonStyle = props.asDynamic()["classes"]["menuButton"] as String

        div {
            h2 {
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
        fun render(rBuilder: RBuilder) = rBuilder.childWithStyles(
            AppbarsDemo::class,
            "root" to root,
            "grow" to grow,
            "menuButton" to menuButton
        ) { }

        private val root = CSSBuilder().apply {
            flexGrow = 1.0
        }

        private val grow = CSSBuilder().apply {
            flexGrow = 1.0
        }

        private val menuButton = CSSBuilder().apply {
            marginLeft = (-12).px
            marginRight = 20.px
        }
    }
}