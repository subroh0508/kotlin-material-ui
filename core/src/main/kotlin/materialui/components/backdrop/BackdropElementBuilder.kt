package materialui.components.backdrop

import kotlinext.js.js
import kotlinext.js.jsObject
import materialui.components.backdrop.enum.BackdropStyle
import materialui.reacttransiton.RTransitionBuilder
import react.RClass

class BackdropElementBuilder internal constructor(
    type: RClass<BackdropProps>,
    classMap: List<Pair<BackdropStyle, String>>
) : RTransitionBuilder<BackdropProps>(type, jsObject { }){
    init {
        props.classes(classMap)
    }

    fun BackdropProps.classes(vararg classMap: Pair<Enum<*>, String>) {
        classes(classMap.map { (key, value) -> key to value })
    }

    fun BackdropProps.classes(classMap: List<Pair<Enum<*>, String>>) {
        classes(classMap.map { (key, value) -> key.toString() to value })
    }

    fun BackdropProps.classes(vararg classMap: Pair<String, String>) {
        classes(classMap.map { (key, value) -> key to value })
    }

    fun BackdropProps.classes(classMap: List<Pair<String, String>>) {
        if (classMap.isEmpty()) {
            return
        }

        val classesObj: dynamic = jsObject { }

        classMap.forEach { (key, value) -> classesObj[key] = value }

        asDynamic()["classes"] = classesObj as Any
    }

    fun BackdropProps.transitionDuration(msec: Long) { transitionDuration = msec }
    fun BackdropProps.transitionDuration(enter: Long?, start: Long?) { transitionDuration = js { this["enter"] = enter; this["start"] } }
}