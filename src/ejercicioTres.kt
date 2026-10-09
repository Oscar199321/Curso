import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale
var radioCirculo = 0.0



fun main () {
    println("Ingrese el radio del círculo:")
    radioCirculo = readLine()!!.toDouble()
    var pi = 3.14159
    var areaCirculoCentimetros = pi*(radioCirculo*radioCirculo)
    var circunferenciaCirculoCentimetros = pi*(2*radioCirculo)

    var areaCirculoPulgadas = areaCirculoCentimetros / 6.4516
    var circunferenciaCirculoPulgadas = circunferenciaCirculoCentimetros / 2.54

    val formatoCirculo = DecimalFormat("#,###,###.##", DecimalFormatSymbols(Locale.US))

    println("""
        ***Centímetros***
        
        Área             | ${formatoCirculo.format(areaCirculoCentimetros)}
        Circunferencia   | ${formatoCirculo.format(circunferenciaCirculoCentimetros)}
        
        ***Pulgadas***
        
        Área             | ${formatoCirculo.format(areaCirculoPulgadas)}
        Circunferencia   | ${formatoCirculo.format(circunferenciaCirculoPulgadas)}
    """.trimIndent())
}