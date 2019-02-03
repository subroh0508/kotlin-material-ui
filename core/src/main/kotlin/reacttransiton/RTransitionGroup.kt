package reacttransiton

import kotlinx.html.Tag
import react.ReactElement

interface RTransitionGroup<T: Tag> {
    var Tag.appear: Boolean
    var Tag.enter: Boolean
    var Tag.exit: Boolean
    var Tag.childFactory: (ReactElement) -> ReactElement
}