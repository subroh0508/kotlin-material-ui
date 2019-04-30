package materialui.styles.typography

external interface Typography : FontStyle {
    val h1: TypographyStyle
    val h2: TypographyStyle
    val h3: TypographyStyle
    val h4: TypographyStyle
    val h5: TypographyStyle
    val h6: TypographyStyle
    val subtitle1: TypographyStyle
    val subtitle2: TypographyStyle
    val body1: TypographyStyle
    val body2: TypographyStyle
    val caption: TypographyStyle
    val button: TypographyStyle
    val overline: TypographyStyle
    val pxToRem: (Number) -> String
}
