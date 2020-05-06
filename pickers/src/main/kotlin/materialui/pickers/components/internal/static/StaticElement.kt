package materialui.pickers.components.internal.static

import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface StaticElement {
    var RProps.displayStaticWrapperAs: DisplayStaticWrapperAs?
}

internal class StaticDelegate<P: StaticWrapperProps>(props: P) : StaticElement {
    override var RProps.displayStaticWrapperAs: DisplayStaticWrapperAs? by props
}
