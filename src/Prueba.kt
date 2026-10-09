import tareaCurso.alumnos
import tareaCurso.auxSumatoriaCalificacion
import tareaCurso.calificaciones

fun main(){

    var calificacionMasAlta = 0
    var auxCalificacionMasAlta = 0

        while ( auxCalificacionMasAlta != calificaciones.size)   {


            for (i in 0 until calificaciones.size) {

                if (calificaciones[auxCalificacionMasAlta] >= calificaciones[i]) {
                    calificacionMasAlta += 1


                    if(calificacionMasAlta == calificaciones.size){
                        println(calificaciones[auxCalificacionMasAlta])

                    }
                }



            }
            auxCalificacionMasAlta += 1
            calificacionMasAlta = 0
        }

}






