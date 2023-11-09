package parser.tokens

class TokenTypes {
    companion object {
        val tokenList: Map<String, String> = mapOf(
            "NUMBER" to "^[0-9]*",
            "VARIABLE_INIT" to "^val*",
            "VARIABLE_NAME" to "^[a-zA-Z0-9]*", //"(^[a-z]|[A-Z0-9])[a-z]*",
            "ASSIGN_VARIABLE" to "=",
            "LOG" to "print",
            "PLUS" to "\\+",
            "MINUS" to "\\-",
            "LPAR" to "\\(",
            "RPAR" to "\\)"
        )
    }
}