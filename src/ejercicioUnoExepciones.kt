package ejercicioUnoExepciones

val cantidadIngrediente = arrayOf(
    20.0,
    1.0,
    7.5,
    3.75,
    1.5,
    0.15,
    0.05,
    12.0
)


fun main() {



    print("\nTotal de donas a elaborar: ")
    val tot = readLine()!!.toIntOrNull()
    tot?.let {

    if (tot >= 20){

    val c = if (tot < 100) {
        tot * 6.0
    } else {
        tot * 5.55
    }

    println(
        """
        ***********************************
        Ingredientes para $tot donas

        Harina       | ${Math.round(cantidadIngrediente[0] * tot)} gramos
        Levadura     | ${Math.round(cantidadIngrediente[1] * tot)} gramos
        Azucar       | ${Math.round(cantidadIngrediente[2] * tot)} gramos
        Leche        | ${Math.round(cantidadIngrediente[3] * tot)} mililitros
        Mantequilla  | ${Math.round(cantidadIngrediente[4] * tot)} gramos
        Huevo        | ${Math.round(cantidadIngrediente[5] * tot)} huevos
        Sal          | ${Math.round(cantidadIngrediente[6] * tot)} gramos
        Aceite       | ${Math.round(cantidadIngrediente[7] * tot)} mililitros
        ***********************************
        Total a cobrar: $${Math.round(c)}
        ***********************************
    """
    )

    }else
        println("El pedido debe ser mínimo de 20 donas")
        main()
    }

   println("Se debe ingresar un número entero, intenta nuevamente")
    main()

}