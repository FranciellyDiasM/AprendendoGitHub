package controller

class TempConverterController {

    /*
    O calculo para converter celsius para fahrenheit é: valor * 1.8 + 32
     */
    fun convert(celsius: Double): Double {
        val fahrenheit = celsius * 1.8 + 32
        return fahrenheit
    }
}