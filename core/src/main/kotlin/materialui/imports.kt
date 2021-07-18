@file:JsModule("@material-ui/core")
@file:JsNonModule

package materialui

import materialui.components.appbar.AppBarProps
import materialui.components.avatar.AvatarProps
import materialui.components.backdrop.BackdropProps
import materialui.components.badge.BadgeProps
import materialui.components.bottomnavigation.BottomNavigationProps
import materialui.components.bottomnavigationaction.BottomNavigationActionProps
import materialui.components.breadcrumbs.BreadcrumbsProps
import materialui.components.button.ButtonProps
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.buttonbase.TouchRippleProps
import materialui.components.buttongroup.ButtonGroupProps
import materialui.components.card.CardProps
import materialui.components.cardactionarea.CardActionAreaProps
import materialui.components.cardactions.CardActionsProps
import materialui.components.cardcontent.CardContentProps
import materialui.components.cardheader.CardHeaderProps
import materialui.components.cardmedia.CardMediaProps
import materialui.components.checkbox.CheckboxProps
import materialui.components.chip.ChipProps
import materialui.components.circularprogress.CircularProgressProps
import materialui.components.clickawaylistener.ClickAwayListenerProps
import materialui.components.collapse.CollapseProps
import materialui.components.container.ContainerProps
import materialui.components.cssbaseline.CssBaselineProps
import materialui.components.dialog.DialogProps
import materialui.components.dialogactions.DialogActionsProps
import materialui.components.dialogcontent.DialogContentProps
import materialui.components.dialogcontenttext.DialogContentTextProps
import materialui.components.dialogtitle.DialogTitleProps
import materialui.components.divider.DividerProps
import materialui.components.drawer.DrawerProps
import materialui.components.expansionpanel.ExpansionPanelProps
import materialui.components.expansionpanelactions.ExpansionPanelActionsProps
import materialui.components.expansionpaneldetails.ExpansionPanelDetailsProps
import materialui.components.expansionpanelsummary.ExpansionPanelSummaryProps
import materialui.components.fab.FabProps
import materialui.components.fade.FadeProps
import materialui.components.filledinput.FilledInputProps
import materialui.components.formcontrol.FormControlProps
import materialui.components.formcontrollabel.FormControlLabelProps
import materialui.components.formgroup.FormGroupProps
import materialui.components.formhelpertext.FormHelperTextProps
import materialui.components.formlabel.FormLabelProps
import materialui.components.grid.GridProps
import materialui.components.gridlist.GridListProps
import materialui.components.gridlisttile.GridListTileProps
import materialui.components.gridlisttilebar.GridListTileBarProps
import materialui.components.grow.GrowProps
import materialui.components.hidden.HiddenProps
import materialui.components.icon.IconProps
import materialui.components.iconbutton.IconButtonProps
import materialui.components.input.InputProps
import materialui.components.inputadornment.InputAdornmentProps
import materialui.components.inputbase.InputBaseProps
import materialui.components.inputlabel.InputLabelProps
import materialui.components.linearprogress.LinearProgressProps
import materialui.components.link.LinkProps
import materialui.components.list.ListProps
import materialui.components.listitem.ListItemProps
import materialui.components.listitemavatar.ListItemAvatarProps
import materialui.components.listitemicon.ListItemIconProps
import materialui.components.listitemsecondaryaction.ListItemSecondaryActionProps
import materialui.components.listitemtext.ListItemTextProps
import materialui.components.listsubheader.ListSubheaderProps
import materialui.components.menu.MenuProps
import materialui.components.menuitem.MenuItemProps
import materialui.components.menulist.MenuListProps
import materialui.components.mobilestepper.MobileStepperProps
import materialui.components.modal.ModalProps
import materialui.components.nativeselect.NativeSelectProps
import materialui.components.nossr.NoSsrProps
import materialui.components.outlinedinput.OutlinedInputProps
import materialui.components.paper.PaperProps
import materialui.components.popover.PopoverProps
import materialui.components.popper.PopperProps
import materialui.components.portal.PortalProps
import materialui.components.radio.RadioProps
import materialui.components.radiogroup.RadioGroupProps
import materialui.components.rootref.RootRefProps
import materialui.components.select.SelectProps
import materialui.components.slide.SlideProps
import materialui.components.slider.SliderProps
import materialui.components.snackbar.SnackbarProps
import materialui.components.snackbarcontent.SnackbarContentProps
import materialui.components.step.StepProps
import materialui.components.stepbutton.StepButtonProps
import materialui.components.stepconnector.StepConnectorProps
import materialui.components.stepcontent.StepContentProps
import materialui.components.stepicon.StepIconProps
import materialui.components.steplabel.StepLabelProps
import materialui.components.stepper.StepperProps
import materialui.components.svgicon.SvgIconProps
import materialui.components.swipeabledrawer.SwipeableDrawerProps
import materialui.components.switches.SwitchProps
import materialui.components.tab.TabProps
import materialui.components.table.TableProps
import materialui.components.tablebody.TableBodyProps
import materialui.components.tablecell.TableCellProps
import materialui.components.tablefooter.TableFooterProps
import materialui.components.tablehead.TableHeadProps
import materialui.components.tablepagination.TablePaginationProps
import materialui.components.tablerow.TableRowProps
import materialui.components.tablesortlabel.TableSortLabelProps
import materialui.components.tabs.TabsProps
import materialui.components.textfield.TextFieldProps
import materialui.components.toolbar.ToolbarProps
import materialui.components.tooltip.TooltipProps
import materialui.components.typography.TypographyProps
import materialui.components.zoom.ZoomProps
import materialui.styles.GenerateClassNameOptions
import materialui.styles.JssOptions
import materialui.styles.breakpoint.Breakpoints
import materialui.styles.breakpoint.options.BreakpointsOptions
import materialui.styles.mixins.Mixins
import materialui.styles.mixins.options.MixinsOptions
import materialui.styles.muitheme.MuiTheme
import materialui.styles.muitheme.options.MuiThemeOptions
import materialui.styles.palette.Palette
import materialui.styles.palette.options.PaletteOptions
import materialui.styles.stylesprovider.GenerateId
import materialui.styles.stylesprovider.StylesProviderProps
import materialui.styles.typography.Typography
import react.*

internal external val AppBar: ComponentType<AppBarProps>
internal external val Avatar: ComponentType<AvatarProps>
internal external val Backdrop: ComponentType<BackdropProps>
internal external val Badge: ComponentType<BadgeProps>
internal external val BottomNavigation: ComponentType<BottomNavigationProps>
internal external val BottomNavigationAction: ComponentType<BottomNavigationActionProps>
internal external val Breadcrumbs: ComponentType<BreadcrumbsProps>
internal external val Button: ComponentType<ButtonProps>
internal external val ButtonBase: ComponentType<ButtonBaseProps>
internal external val ButtonGroup: ComponentType<ButtonGroupProps>
internal external val Card: ComponentType<CardProps>
internal external val CardActionArea: ComponentType<CardActionAreaProps>
internal external val CardActions: ComponentType<CardActionsProps>
internal external val CardContent: ComponentType<CardContentProps>
internal external val CardHeader: ComponentType<CardHeaderProps>
internal external val CardMedia: ComponentType<CardMediaProps>
internal external val Checkbox: ComponentType<CheckboxProps>
internal external val Chip: ComponentType<ChipProps>
internal external val CircularProgress: ComponentType<CircularProgressProps>
internal external val ClickAwayListener: ComponentType<ClickAwayListenerProps>
internal external val Collapse: ComponentType<CollapseProps>
internal external val Container: ComponentType<ContainerProps>
internal external val CssBaseline: ComponentType<CssBaselineProps>
internal external val Dialog: ComponentType<DialogProps>
internal external val DialogActions: ComponentType<DialogActionsProps>
internal external val DialogContent: ComponentType<DialogContentProps>
internal external val DialogContentText: ComponentType<DialogContentTextProps>
internal external val DialogTitle: ComponentType<DialogTitleProps>
internal external val Divider: ComponentType<DividerProps>
internal external val Drawer: ComponentType<DrawerProps>
internal external val ExpansionPanel: ComponentType<ExpansionPanelProps>
internal external val ExpansionPanelActions: ComponentType<ExpansionPanelActionsProps>
internal external val ExpansionPanelDetails: ComponentType<ExpansionPanelDetailsProps>
internal external val ExpansionPanelSummary: ComponentType<ExpansionPanelSummaryProps>
internal external val Fab: ComponentType<FabProps>
internal external val Fade: ComponentType<FadeProps>
internal external val FilledInput: ComponentType<FilledInputProps>
internal external val FormControl: ComponentType<FormControlProps>
internal external val FormControlLabel: ComponentType<FormControlLabelProps>
internal external val FormGroup: ComponentType<FormGroupProps>
internal external val FormHelperText: ComponentType<FormHelperTextProps>
internal external val FormLabel: ComponentType<FormLabelProps>
internal external val Grid: ComponentType<GridProps>
internal external val GridList: ComponentType<GridListProps>
internal external val GridListTile: ComponentType<GridListTileProps>
internal external val GridListTileBar: ComponentType<GridListTileBarProps>
internal external val Grow: ComponentType<GrowProps>
internal external val Hidden: ComponentType<HiddenProps>
internal external val Icon: ComponentType<IconProps>
internal external val IconButton: ComponentType<IconButtonProps>
internal external val Input: ComponentType<InputProps>
internal external val InputAdornment: ComponentType<InputAdornmentProps>
internal external val InputBase: ComponentType<InputBaseProps>
internal external val InputLabel: ComponentType<InputLabelProps>
internal external val LinearProgress: ComponentType<LinearProgressProps>
internal external val Link: ComponentType<LinkProps>
internal external val List: ComponentType<ListProps>
internal external val ListItem: ComponentType<ListItemProps>
internal external val ListItemAvatar: ComponentType<ListItemAvatarProps>
internal external val ListItemIcon: ComponentType<ListItemIconProps>
internal external val ListItemSecondaryAction: ComponentType<ListItemSecondaryActionProps>
internal external val ListItemText: ComponentType<ListItemTextProps>
internal external val ListSubheader: ComponentType<ListSubheaderProps>
internal external val Menu: ComponentType<MenuProps>
internal external val MenuItem: ComponentType<MenuItemProps>
internal external val MenuList: ComponentType<MenuListProps>
internal external val MobileStepper: ComponentType<MobileStepperProps>
internal external val Modal: ComponentType<ModalProps>
internal external val NativeSelect: ComponentType<NativeSelectProps>
internal external val NoSsr: ComponentType<NoSsrProps>
internal external val OutlinedInput: ComponentType<OutlinedInputProps>
internal external val Paper: ComponentType<PaperProps>
internal external val Popover: ComponentType<PopoverProps>
internal external val Popper: ComponentType<PopperProps>
internal external val Portal: ComponentType<PortalProps>
internal external val Radio: ComponentType<RadioProps>
internal external val RadioGroup: ComponentType<RadioGroupProps>
internal external val RootRef: ComponentType<RootRefProps>
internal external val Select: ComponentType<SelectProps>
internal external val Slide: ComponentType<SlideProps>
internal external val Slider: ComponentType<SliderProps>
internal external val Snackbar: ComponentType<SnackbarProps>
internal external val SnackbarContent: ComponentType<SnackbarContentProps>
internal external val Step: ComponentType<StepProps>
internal external val StepButton: ComponentType<StepButtonProps>
internal external val StepConnector: ComponentType<StepConnectorProps>
internal external val StepContent: ComponentType<StepContentProps>
internal external val StepIcon: ComponentType<StepIconProps>
internal external val StepLabel: ComponentType<StepLabelProps>
internal external val Stepper: ComponentType<StepperProps>
internal external val SvgIcon: ComponentType<SvgIconProps>
internal external val SwipeableDrawer: ComponentType<SwipeableDrawerProps>
internal external val Switch: ComponentType<SwitchProps>
internal external val Tab: ComponentType<TabProps>
internal external val Table: ComponentType<TableProps>
internal external val TableBody: ComponentType<TableBodyProps>
internal external val TableCell: ComponentType<TableCellProps>
internal external val TableFooter: ComponentType<TableFooterProps>
internal external val TableHead: ComponentType<TableHeadProps>
internal external val TablePagination: ComponentType<TablePaginationProps>
internal external val TableRow: ComponentType<TableRowProps>
internal external val TableSortLabel: ComponentType<TableSortLabelProps>
internal external val Tabs: ComponentType<TabsProps>
internal external val TextField: ComponentType<TextFieldProps>
internal external val Toolbar: ComponentType<ToolbarProps>
internal external val Tooltip: ComponentType<TooltipProps>
internal external val TouchRipple: ComponentType<TouchRippleProps>
internal external val Typography: ComponentType<TypographyProps>
internal external val Zoom: ComponentType<ZoomProps>

internal external val ThemeProvider: ComponentType<RProps>
internal external val StylesProvider: ComponentType<StylesProviderProps>


@JsName("createBreakpoints")
internal external fun rawCreateBreakpoints(breakpoints: BreakpointsOptions): Breakpoints
@JsName("createMuiTheme")
internal external fun rawCreateMuiTheme(options: MuiThemeOptions): MuiTheme
@JsName("createPalette")
internal external fun rawCreatePalette(palette: PaletteOptions): Palette
@JsName("createTypography")
internal external fun rawCreateTypography(palette: Palette, typography: dynamic): Typography
@JsName("makeStyles")
internal external fun rawMakeStyles(styles: dynamic, option: dynamic): MakeStyles
@JsName("withStyles")
internal external fun rawWithStyles(styles: dynamic, option: dynamic): WithStyles

external fun jssPreset(): JssOptions
external fun createGenerateClassName(option: GenerateClassNameOptions): GenerateId

external fun createMixins(breakpoints: Breakpoints, spacing: dynamic, mixins: MixinsOptions): Mixins
external fun useTheme(): MuiTheme

@JsName("useMediaQuery")
internal external fun rawUseMediaQuery(query: dynamic, options: dynamic): Boolean
