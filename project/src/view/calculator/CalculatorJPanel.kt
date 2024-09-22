package view.calculator

import controller.MathController
import javax.swing.*

class CalculatorJPanel : JPanel() {

    private val mathController = MathController()

    init {
        val num1Field = JTextField(10)
        val num2Field = JTextField(10)
        val operatorComboBox = JComboBox(arrayOf("+", "-", "*", "/"))
        val calcButton = JButton("Calcular")
        val operationResult = JLabel("Resultado: ")

        this.add(num1Field)
        this.add(operatorComboBox)
        this.add(num2Field)
        this.add(calcButton)
        this.add(operationResult)

        calcButton.addActionListener {
            try {
                val num1 = num1Field.text.toDoubleOrNull() ?: throw IllegalStateException()
                val num2 = num2Field.text.toDoubleOrNull() ?: throw IllegalStateException()
                val operator = operatorComboBox.selectedItem as String

                val result = when (operator) {
                    "+" -> mathController.add(num1, num2)
                    "-" -> mathController.subtract(num1, num2)
                    "*" -> mathController.multiply(num1, num2)
                    "/" -> mathController.divide(num1, num2)
                    else -> throw IllegalStateException()
                }

                operationResult.text = "Resultado: $result"
            } catch (e: IllegalStateException) {
                operationResult.text = "Resultado: Calculo inválido"
            }


        }
    }
}