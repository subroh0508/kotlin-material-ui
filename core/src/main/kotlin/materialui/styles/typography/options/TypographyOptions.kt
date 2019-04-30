package materialui.styles.typography.options

external interface TypographyOptions : FontStyleOptions {
    var h1: TypographyStyleOptions?
    var h2: TypographyStyleOptions?
    var h3: TypographyStyleOptions?
    var h4: TypographyStyleOptions?
    var h5: TypographyStyleOptions?
    var h6: TypographyStyleOptions?
    var subtitle1: TypographyStyleOptions?
    var subtitle2: TypographyStyleOptions?
    var body1: TypographyStyleOptions?
    var body2: TypographyStyleOptions?
    var caption: TypographyStyleOptions?
    var button: TypographyStyleOptions?
    var overline: TypographyStyleOptions?
    var pxToRem: ((Number) -> String)?
}