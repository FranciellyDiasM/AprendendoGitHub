package controller

class MathController {

    fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    fun divide(num1: Double, num2: Double): String {
        if(num2 == 0.0) {
            return "Operacao invalida"
        }

        return (num1 / num2).toString()
    }
}