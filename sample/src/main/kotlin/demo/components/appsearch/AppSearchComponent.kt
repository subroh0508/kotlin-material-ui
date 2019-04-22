package demo.components.appsearch

import materialui.components.icon.icon
import materialui.components.input.input
import materialui.components.inputbase.enums.InputBaseStyle
import kotlinx.css.Display
import react.RBuilder
import react.RComponent
import react.RState
import react.dom.div
import styled.css
import styled.styledDiv

class AppSearchComponent : RComponent<AppSearchProps, RState>() {
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