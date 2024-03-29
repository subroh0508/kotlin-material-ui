package demo.components.appsearch

import kotlinx.css.Display
import kotlinx.css.display
import materialui.components.icon.icon
import materialui.components.input.input
import materialui.components.inputbase.enums.InputBaseStyle
import react.RBuilder
import react.RComponent
import react.State
import react.dom.attrs
import react.dom.div
import styled.css
import styled.styledDiv

class AppSearchComponent : RComponent<AppSearchProps, State>() {
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