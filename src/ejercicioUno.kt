fun main() {

    println(capturarDireccionUsuario())



}

fun capturarDireccionUsuario() {

    println("Ingresa tu calle:")
    val  calleUsuario = readLine()
    println("Ingresa tu ciudad:")
    val  ciudadUsuario = readLine()
    println("Ingresa tu estado o provincia:")
    val  estadoOProvinciaUsuario = readLine()
    println("Ingresa tu país:")
    val  paisUsuario = readLine()
    println("Ingresa tu código postal:")
    val  codigoPostalUsuario = readLine()

    return  println("""
        
        *******Dirección de usuario*********
        
        $calleUsuario, $ciudadUsuario, 
        $estadoOProvinciaUsuario, $paisUsuario, $codigoPostalUsuario
    """.trimIndent())


}