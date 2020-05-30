@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import kotlinext.js.jsObject
import materialui.rawCreateBreakpoints
import materialui.styles.breakpoint.options.BreakpointsOptions

fun createBreakpoints(handler: BreakpointsOptions.() -> Unit) = rawCreateBreakpoints(jsObject(handler))
fun defaultBreakpoints() = createBreakpoints {  }
