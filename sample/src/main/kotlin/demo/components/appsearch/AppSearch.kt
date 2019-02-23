package demo.components.appsearch

import components.icon.icon
import components.input.input
import components.inputbase.enums.InputBaseStyle
import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RState
import react.dom.div
import styled.css
import styled.styledDiv
import styles.childWithStyles
import styles.muitheme.*

class AppSearch : RComponent<AppSearchProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            css {
                + props.rootStyle
                display = Display.flex
            }

            div(props.searchStyle) {
                icon {
                    +"search_icon"
                }
                input {
                    attrs {
                        classes(
                            InputBaseStyle.root to props.inputRootStyle,
                            InputBaseStyle.input to props.inputInputStyle
                        )
                        disableUnderline = true
                        placeholder = "Search..."
                        id = "docsearch-input"

                    }
                }
            }
        }
    }

    companion object {
        fun render(rBuilder: RBuilder) = rBuilder.childWithStyles(
            AppSearch::class,
            "root" to root,
            "search" to search,
            "inputRoot" to inputRoot,
            "inputInput" to inputInput
        ) {}

        private val root = { theme: MuiTheme ->
            CSSBuilder().apply {
                fontFamily = theme.typography.fontFamily
                position = Position.relative
                marginRight = (theme.spacing.unit * 2).px
                marginLeft = theme.spacing.unit.px
                borderRadius = theme.shape.borderRadius.px
                backgroundColor = theme.palette.common.white.withAlpha(0.15)
                hover {
                    backgroundColor = theme.palette.common.white.withAlpha(0.25)
                }
                descendants("\$inputInput") {
                    transition = theme.transitions.create("width")
                    width = 120.px
                    focus {
                        width = 170.px
                    }
                }
            }
        }
        private val search = { theme: MuiTheme ->
            CSSBuilder().apply {
                width = (theme.spacing.unit * 9).px
                height = 100.pct
                position = Position.absolute
                pointerEvents = PointerEvents.none
                display = Display.none
                alignItems = Align.center
                justifyContent = JustifyContent.center
            }
        }
        private val inputRoot = { theme: MuiTheme ->
            CSSBuilder().apply {
                color = Color.inherit
            }
        }
        private val inputInput = { theme: MuiTheme ->
            CSSBuilder().apply {
                padding(theme.spacing.unit.px, theme.spacing.unit.px, theme.spacing.unit.px, (theme.spacing.unit * 9).px)
            }
        }
    }
}