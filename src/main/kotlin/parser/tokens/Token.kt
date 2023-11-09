package parser.tokens

data class Token(
    val type: String,
    val value: String,
    val position: Int
)
