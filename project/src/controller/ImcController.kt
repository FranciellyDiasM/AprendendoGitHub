package controller

class ImcController {
    /*
        O IMC é o peso dividido pela altura ao quadrado
     */
    fun calculate(weight: Double, height: Double): String {
        val imc = height
        return "IMC: %.2f".format(imc)
    }
}