package materialui.styles

import kotlinext.js.jsObject
import materialui.createGenerateClassName
import materialui.styles.stylesprovider.GenerateId

external interface GenerateClassNameOptions {
    var disableGlobal: Boolean?
    var productionPrefix: String?
    var seed: String?
}

fun createGenerateClassName(
    disableGlobal: Boolean? = null,
    productionPrefix: String? = null,
    seed: String? = null
): GenerateId{
    return createGenerateClassName(jsObject{
        disableGlobal?.let {this.disableGlobal = it }
        productionPrefix?.let { this.productionPrefix = it }
        seed?. let { this.seed = it }
    })
}