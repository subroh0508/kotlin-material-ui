package materialui.pickers.components.internal.static

interface StaticElement<P: StaticWrapperProps> {
    fun P.displayStaticWrapperAs(v: DisplayStaticWrapperAs)
}

internal class StaticDelegate<P: StaticWrapperProps> : StaticElement<P> {
    override fun P.displayStaticWrapperAs(v: DisplayStaticWrapperAs) { displayStaticWrapperAs = v.name }
}
