import view.calculator.CalculatorJPanel
import view.imc.ImcJPanel
import view.main.MainJFrame
import view.temperatureconverter.TemperatureConverter

fun main() {
    val features = listOf(
        ImcJPanel(),
        CalculatorJPanel(),
        TemperatureConverter()
    )
    MainJFrame("Utilitarios", features)
}
