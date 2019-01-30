package components.values

internal class MilliSecondImpl(
    override val ms: Number
) : MilliSecond {
    internal val value: Any
        get() = ms
}