package materialui.pickers.components.internal.static

import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface StaticElement<P: StaticWrapperProps> {
    fun P.displayStaticWrapperAs(v: DisplayStaticWrapperAs)
}

internal class StaticDelegate<P: StaticWrapperProps> : StaticElement<P> {
    override fun P.displayStaticWrapperAs(v: DisplayStaticWrapperAs) { displayStaticWrapperAs = v.name }
}
