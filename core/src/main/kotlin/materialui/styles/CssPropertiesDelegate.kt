package materialui.styles

import kotlinx.css.*
import kotlin.reflect.KProperty

object FontWeightDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): FontWeight?
            = (thisRef.asDynamic()[property.name] as Int?)?.let { FontWeight(it.toString()) }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: FontWeight?) {
        thisRef.asDynamic()[property.name] = value?.toString()
    }
}

object ReadOnlyFontWeightDelegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): FontWeight
            = FontWeight((thisRef.asDynamic()[property.name] as Int).toString())
}

object LinearDimensionDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): LinearDimension?
        = (thisRef.asDynamic()[property.name] as Any?)?.let { LinearDimension(it.toString()) }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: LinearDimension?) {
        thisRef.asDynamic()[property.name] = value?.toString()
    }
}

object ReadOnlyLinearDimensionDelegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): LinearDimension
            = LinearDimension((thisRef.asDynamic()[property.name] as Any).toString())
}

object ColorDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Color?
            = (thisRef.asDynamic()[property.name] as String?)?.let { Color(it) }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Color?) {
        thisRef.asDynamic()[property.name] = value?.toString()
    }
}

object ReadOnlyColorDelegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): Color
            = Color(thisRef.asDynamic()[property.name] as String)
}

object DirectionDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Direction?
            = (thisRef.asDynamic()[property.name] as String?)?.let { Direction.valueOf(it) }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Direction?) {
        thisRef.asDynamic()[property.name] = value?.toString()
    }
}

object ReadOnlyDirectionDelegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): Direction
            = Direction.valueOf(thisRef.asDynamic()[property.name] as String)
}

object TextTransformDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): TextTransform?
            = (thisRef.asDynamic()[property.name] as String?)?.let { TextTransform.values().find { enum -> enum.toString() == it } }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: TextTransform?) {
        thisRef.asDynamic()[property.name] = value?.toString()
    }
}

object ReadOnlyTextTransformDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): TextTransform
            = (thisRef.asDynamic()[property.name] as String?)?.let { TextTransform.values().find { enum -> enum.toString() == it } }
                ?: throw IllegalArgumentException()
}
