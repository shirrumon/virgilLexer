import parser.Lexer

fun main(args: Array<String>) {
    val code = "val test = 101 val test2 = 666 val exception = 000"

    Lexer(code).parseCodeToTokenArray()
}