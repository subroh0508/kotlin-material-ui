@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import kotlinext.js.js
import materialui.styles.breakpoint.Breakpoints
import materialui.styles.breakpoint.options.BreakpointsOptions

@JsModule("@material-ui/core/styles/createBreakpoints")
private external val createBreakpointsModule: dynamic

fun createBreakpoints(options: BreakpointsOptions): Breakpoints = createBreakpointsModule.default(options) as Breakpoints

fun defaultBreakpoints(): Breakpoints = createBreakpointsModule.default(js { }) as Breakpoints
