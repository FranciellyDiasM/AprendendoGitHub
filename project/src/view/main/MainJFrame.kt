package view.main

import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.JFrame
import javax.swing.JPanel

class MainJFrame(
    title: String,
    panels: List<JPanel>
) : JFrame(title) {

    init {
        this.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        this.size = Dimension(400, 300)
        this.layout = GridLayout(panels.size, 1)


        panels.forEach { panel ->
            this.add(panel)
        }

        this.isVisible = true
    }
}