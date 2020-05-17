package materialui.pickers.components

external interface ToolbarComponentProps : ExportedCalendarProps, ExportedClockViewProps {
    var views: Array<String>?
    var openView: String?
    var date: dynamic
    var setOpenView: ((String) -> Unit)
    var onChange: ((dynamic, Boolean) -> Unit)?
    var toolbarTitle: dynamic
    var toolbarFormat: String?
    var hideTabs: Boolean?
    var dateRangeIcon: dynamic
    var timeIcon: dynamic
    var isLandscape: Boolean?
    //var ampmInClock: Boolean? TODO delete
    var isMobileKeyBoardViewOpen: Boolean?
    var toggleMobileKeyboardView: Boolean?
    var getMobileKeyboardInputViewButtonText: (() -> String)?
}
