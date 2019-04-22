package materialui.components.typography.values

import kotlinext.js.js

object HeadlineMapping {
    var h1: String = "h1"
    var h2: String = "h2" 
    var h3: String = "h3"
    var h4: String = "h4"
    var h5: String = "h5"
    var h6: String = "h6"
    var subtitle1: String = "h6"
    var subtitle2: String = "h6"
    var body1: String = "p"
    var body2: String = "p"
    var display4: String = "h1"
    var display3: String = "h1"
    var display2: String = "h1"
    var display1: String = "h1"
    var headline: String = "h1"
    var title: String = "h2"
    var subheading: String = "h3"

    fun fromDynamic(jsObject: dynamic): HeadlineMapping = HeadlineMapping.apply {
        h1 = @Suppress("UnsafeCastFromDynamic") jsObject.h1
        h2 = @Suppress("UnsafeCastFromDynamic") jsObject.h2
        h3 = @Suppress("UnsafeCastFromDynamic") jsObject.h3
        h4 = @Suppress("UnsafeCastFromDynamic") jsObject.h4
        h5 = @Suppress("UnsafeCastFromDynamic") jsObject.h5
        h6 = @Suppress("UnsafeCastFromDynamic") jsObject.h6
        subtitle1 = @Suppress("UnsafeCastFromDynamic") jsObject.subtitle1
        subtitle2 = @Suppress("UnsafeCastFromDynamic") jsObject.subtitle2
        body1 = @Suppress("UnsafeCastFromDynamic") jsObject.body1
        body2 = @Suppress("UnsafeCastFromDynamic") jsObject.body2
        display4 = @Suppress("UnsafeCastFromDynamic") jsObject.display4
        display3 = @Suppress("UnsafeCastFromDynamic") jsObject.display3
        display2 = @Suppress("UnsafeCastFromDynamic") jsObject.display2
        display1 = @Suppress("UnsafeCastFromDynamic") jsObject.display1
        headline = @Suppress("UnsafeCastFromDynamic") jsObject.headline
        title = @Suppress("UnsafeCastFromDynamic") jsObject.title
        subheading = @Suppress("UnsafeCastFromDynamic") jsObject.subheading
    }

    internal val value: Any = js {
        this.h1 = h1
        this.h2 = h2
        this.h3 = h3
        this.h4 = h4
        this.h5 = h5
        this.h6 = h6
        this.subtitle1 = subtitle1
        this.subtitle2 = subtitle2
        this.body1 = body1
        this.body2 = body2
        this.display4 = display4
        this.display3 = display3
        this.display2 = display2
        this.display1 = display1
        this.headline = headline
        this.title = title
        this.subheading = subheading
    } as Any
}