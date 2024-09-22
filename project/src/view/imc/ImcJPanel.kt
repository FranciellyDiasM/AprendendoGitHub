package view.imc

import controller.ImcController
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

class ImcJPanel : JPanel() {

    private val imcController = ImcController()

    init {
        val pesoField = JTextField(10)
        val alturaField = JTextField(10)
        val imcButton = JButton("Calcular IMC")
        val imcResult = JLabel("IMC: ")

        this.add(JLabel("Peso (kg): "))
        this.add(pesoField)
        this.add(JLabel("Altura (m): "))
        this.add(alturaField)
        this.add(imcButton)
        this.add(imcResult)

        imcButton.addActionListener {
            try {
                val weight = pesoField.text.toDoubleOrNull() ?: throw IllegalStateException()
                val height = alturaField.text.toDoubleOrNull() ?: throw IllegalStateException()

                imcResult.text = imcController.calculate(weight, height)
            } catch (e: IllegalStateException) {
                imcResult.text = "Valores inválidos"
            }


        }
    }
}