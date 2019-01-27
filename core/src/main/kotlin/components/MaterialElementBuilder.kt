package components

import kotlinext.js.jsObject
import kotlinx.css.CSSBuilder
import react.RElementBuilder
import react.ReactElement
import styled.Styled
import styled.StyledBuilder
import styled.StyledProps

abstract class MaterialElementBuilder<P: StyledProps>(
    override val type: Any,
    override var attrs: P = jsObject { }
) : RElementBuilder<P>(attrs),
    StyledBuilder<P>
{
    override val css: CSSBuilder = CSSBuilder()

    open fun create(): ReactElement = Styled.createElement(type, css, attrs, childList)
}