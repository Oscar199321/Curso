package tareaCurso

import kotlin.math.round
import kotlin.math.roundToInt

fun main() {

    println("Ingrese los kilómetros del trayecto:")
    val kilometrosTrayecto = readLine()!!.toString()
    println("Descuento de la tercera 45% aplicar? si o 1 para aplicar, no o 0 para no aplicar")
    val descuentoDesicion = readLine()!!.toString()





    if  (kilometrosTrayecto == "" ) {


        println("Se deben ingresar los kilómetros del viaje")
    }
    else if (descuentoDesicion == "1" || descuentoDesicion == "si" ||descuentoDesicion == "Si" ||descuentoDesicion == "SI" ) {
        val precioViaje = kilometrosTrayecto.toInt() * 2.25
        val precioViajeDescuento = precioViaje*55/100

        println("El precio del viaje es: ${precioViajeDescuento.roundToInt()}")
    }
    else {

        val precioViaje = kilometrosTrayecto.toInt() * 2.25
        println("El precio del viaje es:  ${precioViaje.roundToInt()}")

    }


}