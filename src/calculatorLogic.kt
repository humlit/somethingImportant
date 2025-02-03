fun calculatorStart() {
    var currentSign: String = readln()
    when (currentSign) {
        "+" -> sumCalc(input(), input())
        "-" -> subtractionCalc(input(), input())
        "*" -> multiplicationCalc(input(), input())
        "/" -> divisionCalc(input(), input())
        else -> throw IllegalArgumentException("Unknown sign")
    }
}