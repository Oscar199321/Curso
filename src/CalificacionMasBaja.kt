import tareaCurso.calificaciones

fun main(){

    var calificacionMasBaja = 0
    var auxCalificacionMasBaja = 0

    while ( auxCalificacionMasBaja != calificaciones.size)   {


        for (i in 0 until calificaciones.size) {

            if (calificaciones[auxCalificacionMasBaja] <= calificaciones[i]) {
                calificacionMasBaja += 1


                if(calificacionMasBaja == calificaciones.size){
                    println(calificaciones[auxCalificacionMasBaja])

                }
            }



        }
        auxCalificacionMasBaja += 1
        calificacionMasBaja = 0
    }

}

