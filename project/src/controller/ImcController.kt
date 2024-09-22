package controller

class ImcController {
    /*
        O IMC é o peso dividido pela altura ao quadrado
     */
    fun calculate(weight: Double, height: Double): String {
        if(height == 0.0 || weight == 0.0) {
            return "entrada invalida"
        }

        val imc = weight / (height * height)

        return "IMC: %.2f".format(imc)
    }
}