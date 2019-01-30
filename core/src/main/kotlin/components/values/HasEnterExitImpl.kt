package components.values

internal class HasEnterExitImpl(
    override val enter: Number,
    override val exit: Number
) : HasEnterExit {
    internal constructor(jsObject: dynamic) : this(
        enter = @Suppress("UnsafeCastFromDynamic") jsObject.enter,
        exit = @Suppress("UnsafeCastFromDynamic") jsObject.exit
    )

    internal val value: Any
        get() = kotlinext.js.js {
            this.enter = enter
            this.exit = exit
        } as Any
}