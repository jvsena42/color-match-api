package colormatch.color

import kotlinx.serialization.Serializable
import java.util.IdentityHashMap

@Serializable
data class ColorModel(
    val hexColor: String
)
