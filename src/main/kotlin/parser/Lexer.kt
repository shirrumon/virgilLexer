package parser

import parser.tokens.Token
import parser.tokens.TokenTypes

class Lexer(private var code: String) {
    init {
        code = code.replace("\\s".toRegex(), "")
    }

    private var tokenArray: ArrayList<Token> = arrayListOf()

    fun parseCodeToTokenArray(): ArrayList<Token> {
        var isCodeEnded = false;

        while(!isCodeEnded) {
            if(code.isEmpty()) {
                isCodeEnded = true
            }

            TokenTypes.tokenList.forEach { tokens ->
                val match = Regex(tokens.value).find(code)
                match?.let {
                    if(it.value.isNotEmpty()) {
                        tokenArray.add(Token(
                            tokens.key,
                            match.value,
                            match.range.last
                        ))

                        code = code.removeRange(match.range)
                    }
                }
            }
        }

        println(tokenArray)
        return tokenArray
    }
}