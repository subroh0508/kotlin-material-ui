package demo

import kotlinx.css.margin
import kotlinx.html.InputType
import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.id
import materialui.components.button.button
import materialui.components.button.enums.ButtonColor
import materialui.components.button.enums.ButtonStyle
import materialui.components.button.enums.ButtonVariant
import materialui.styles.makeStyles
import materialui.styles.muitheme.spacing
import react.RProps
import react.child
import react.dom.input
import react.dom.label
import react.dom.render
import react.functionalComponent
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        child(component) {}
    }
}

val component = functionalComponent<RProps> {
    val styles = useStyles()

    button {
        attrs {
            variant = ButtonVariant.contained
            classes(ButtonStyle.root to styles.root)
        }

        +"Default"
    }
    button {
        attrs {
            variant = ButtonVariant.contained
            color = ButtonColor.primary
            classes(ButtonStyle.root to styles.root)
        }

        +"Primary"
    }
    button {
        attrs {
            variant = ButtonVariant.contained
            color = ButtonColor.secondary
            classes(ButtonStyle.root to styles.root)
        }

        +"Secondary"
    }
    button {
        attrs {
            variant = ButtonVariant.contained
            color = ButtonColor.secondary
            // for fix #6: https://github.com/subroh0508/kotlin-material-ui/issues/6
            (this as Tag).disabled = true
            classes(ButtonStyle.root to styles.root)
        }

        +"Disabled"
    }
    button {
        attrs {
            variant = ButtonVariant.contained
            href = "#contained-buttons"
            classes(ButtonStyle.root to styles.root)
        }

        +"Link"
    }
}

external interface Styles {
    val root: String
}

val useStyles = makeStyles<Styles> {
    "root" {
        margin(theme.spacing(1))
    }
}
