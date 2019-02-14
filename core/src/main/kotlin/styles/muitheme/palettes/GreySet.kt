package styles.muitheme.palettes

@Suppress("EnumEntryName")
enum class GreySet(private val value: String) {
    _50("50"), _100("100"), _200("200"), _300("300"), _400("400"),
    _500("500"), _600("600"), _700("700"), _800("800"), _900("900"),
    A100("A100"), A200("A200"), A400("A400"), A700("A700");

    override fun toString() = value
}