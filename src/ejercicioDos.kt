import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale
var salarioMensualBruto = 0.0
var impuestosMensualPorcentaje = 0.0

fun main () {
    println("Ingrese su salario mensual Bruto:")
    salarioMensualBruto = readLine()!!.toDouble()
    println("Ingrese el impuesto mensual (porcentaje:)")
    impuestosMensualPorcentaje = readLine()!!.toDouble()

    var impuestoMensual = impuestosMensualPorcentaje*salarioMensualBruto/100
    var salarioMensualNeto = salarioMensualBruto -impuestoMensual

    var salarioAnualNeto = 12 * salarioMensualNeto
    var impuestoAnual = 12 * impuestoMensual

    val formatoImpuestos = DecimalFormat("#,###,###.##", DecimalFormatSymbols(Locale.US))

    println("""
        ***Resumen de impuestos***
        
        Salario mensual neto: $${formatoImpuestos.format(salarioMensualNeto)}
        Impuestos a pagar por mes: $${formatoImpuestos.format(impuestoMensual)}
        
        Salario anual neto: $${formatoImpuestos.format(salarioAnualNeto)}
        Impuestos a pagar por año: $${formatoImpuestos.format(impuestoAnual)}
        
    """.trimIndent())

}