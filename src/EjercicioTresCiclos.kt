import tareaCurso.alumnos
val numero=0.0
var sumaNumeros=0.0
var promedio = 0.0
var numerosAdquiridos = 0.0

fun main(){

    println("Ingresar un numero, cuando ingresas 0 se detiene el programa y hace una sumatoria de los numeros que agregaste y saca promedio")
val numeros = arrayListOf<Double>()
    do {
println("numero:")
val  numero = readLine()!!.toDouble()
if (numero != 0.0) numeros.add(numero)

    } while (numero != 0.0)

         sumaNumeros = sumaNumeros + numero

    println("$sumaNumeros  ${numeros.size}")

if (numero == 0.0) {

promedio = numeros.sum()/numeros.size

    println("suma:${numeros.sum()}  promedio: $promedio")

}


}