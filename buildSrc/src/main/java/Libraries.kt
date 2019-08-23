@Suppress("unused")
object Libraries {
    object Plugin {
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val kotlinxSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
    }

    object KotlinJs {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-js:${Versions.kotlin}"
        const val test = "org.jetbrains.kotlin:kotlin-test-js:${Versions.kotlin}"
        const val html = "org.jetbrains.kotlinx:kotlinx-html-js:${Versions.kotlinxHtml}"
        const val react = "org.jetbrains:kotlin-react:${Versions.kotlinReact}"
        const val reactDom = "org.jetbrains:kotlin-react:${Versions.kotlinReact}"
        const val styled = "org.jetbrains:kotlin-styled:${Versions.kotlinJsWrappers}"
    }
}
