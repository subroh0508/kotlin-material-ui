// @see: https://github.com/JetBrains/kotlin/commit/9baa24e626b48ccfaacbf5724f58337cd29e80ab
config.devServer.static = config.devServer.contentBase
delete config.devServer.contentBase
