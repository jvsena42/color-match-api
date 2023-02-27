package colormatch.color

import java.awt.Color
import kotlin.math.pow
import kotlin.math.sqrt

class ColorController {

    fun getColorDistance(colorInt1: Int, colorInt2: Int): Double {
        val color1 = Color(colorInt1)
        val color2 = Color(colorInt2)

        val red1 = color1.red
        val green1 = color1.green
        val blue1 = color1.blue
        val red2 = color2.red
        val green2 = color2.green
        val blue2 = color2.blue

        val distance = sqrt(
            (red2 - red1).toDouble().pow(2.0) +
                    (green2 - green1).toDouble().pow(2.0) +
                    (blue2 - blue1).toDouble().pow(2.0)
        )
        return distance
    }
}