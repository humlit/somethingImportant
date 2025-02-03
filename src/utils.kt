val sumCalc: (Double, Double) -> Unit = { firstNumber, secondNumber ->
    println(firstNumber + secondNumber)
}

val subtractionCalc: (Double, Double) -> Unit = { firstNumber, secondNumber ->
    println(firstNumber - secondNumber)
}

val multiplicationCalc: (Double, Double) -> Unit = { firstNumber, secondNumber ->
    println(firstNumber * secondNumber)
}

val divisionCalc: (Double, Double) -> Unit = { firstNumber, secondNumber ->
    require(secondNumber > 0) {
        throw IllegalArgumentException("You can't divide by zero.")
    }
    println(firstNumber / secondNumber)
}

val input: () -> Double = {
    readln().toDouble()
}