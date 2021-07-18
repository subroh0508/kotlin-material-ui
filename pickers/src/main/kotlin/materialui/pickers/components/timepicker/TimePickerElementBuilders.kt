package materialui.pickers.components.timepicker

import kotlinext.js.jsObject
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
import materialui.pickers.components.calendar.ArrowSwitcherElement
import materialui.pickers.components.internal.desktop.DesktopWrapperElementBuilder
import materialui.pickers.components.internal.modal.ModalWrapperElementBuilder
import materialui.pickers.components.internal.responsive.ResponsiveWrapperElementBuilder
import materialui.pickers.components.internal.static.StaticWrapperElementBuilder
import react.ComponentType

class TimePickerElementBuilder internal constructor(
    type: ComponentType<TimePickerProps>, className: String?, props: TimePickerProps = jsObject { }
) : ResponsiveWrapperElementBuilder<TimePickerProps>(type, className, props),
    TimePickerElement<TimePickerProps> by TimePickerDelegate(),
    ArrowSwitcherElement<TimePickerProps> by ArrowSwitcherDelegate(),
    TimeValidationElement<TimePickerProps> by TimeValidationDelegate()

class MobileTimePickerElementBuilder internal constructor(
    type: ComponentType<MobileTimePickerProps>, className: String?, props: MobileTimePickerProps = jsObject { }
) : ModalWrapperElementBuilder<MobileTimePickerProps>(type, className, props),
    TimePickerElement<TimePickerProps> by TimePickerDelegate(),
    ArrowSwitcherElement<TimePickerProps> by ArrowSwitcherDelegate(),
    TimeValidationElement<TimePickerProps> by TimeValidationDelegate()

class DesktopTimePickerElementBuilder internal constructor(
    type: ComponentType<DesktopTimePickerProps>, className: String?, props: DesktopTimePickerProps = jsObject { }
) : DesktopWrapperElementBuilder<DesktopTimePickerProps>(type, className, props),
    TimePickerElement<TimePickerProps> by TimePickerDelegate(),
    ArrowSwitcherElement<TimePickerProps> by ArrowSwitcherDelegate(),
    TimeValidationElement<TimePickerProps> by TimeValidationDelegate()

class StaticTimePickerElementBuilder internal constructor(
    type: ComponentType<StaticTimePickerProps>, className: String?, props: StaticTimePickerProps = jsObject { }
) : StaticWrapperElementBuilder<StaticTimePickerProps>(type, className, props),
    TimePickerElement<TimePickerProps> by TimePickerDelegate(),
    ArrowSwitcherElement<TimePickerProps> by ArrowSwitcherDelegate(),
    TimeValidationElement<TimePickerProps> by TimeValidationDelegate()
