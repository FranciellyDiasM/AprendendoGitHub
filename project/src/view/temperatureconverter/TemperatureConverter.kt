package view.temperatureconverter

import controller.TempConverterController
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

class TemperatureConverter: JPanel() {

    private val tempConverterController = TempConverterController()

    init {
        val celsiusField = JTextField(10)
        val convertButton = JButton("Converter")
        val fahrenheitResult = JLabel("Fahrenheit: ")

        this.add(JLabel("Celsius: "))
        this.add(celsiusField)
        this.add(convertButton)
        this.add(fahrenheitResult)

        convertButton.addActionListener {
           celsiusField.text.toDoubleOrNull()?.let { celsius ->
               val fahrenheit = tempConverterController.convert(celsius)
               fahrenheitResult.text = "Fahrenheit: %.2f".format(fahrenheit)
            } ?: run {
               fahrenheitResult.text = "Fahrenheit: Valor inválido"
           }
        }
    }
}