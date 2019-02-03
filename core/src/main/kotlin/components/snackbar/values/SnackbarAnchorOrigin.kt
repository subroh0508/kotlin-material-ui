package components.snackbar.values

import components.snackbar.enums.SnackbarAnchorOriginHorizontal
import components.snackbar.enums.SnackbarAnchorOriginVertical
import kotlinext.js.js

class SnackbarAnchorOrigin(
    private val horizontal: SnackbarAnchorOriginHorizontal,
    private val vertical: SnackbarAnchorOriginVertical
) {
    internal constructor(jsObject: dynamic) : this(
        SnackbarAnchorOriginHorizontal.valueOf(@Suppress("UnsafeCastFromDynamic") jsObject.horizontal),
        SnackbarAnchorOriginVertical.valueOf(@Suppress("UnsafeCastFromDynamic") jsObject.vertical)
    )

    internal val value: Any = js {
        this.horizontal = horizontal.toString()
        this.vertical = vertical.toString()
    } as Any
}