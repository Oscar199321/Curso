package tareaCurso

import sun.net.www.content.audio.x_aiff

var promedioCalificacion: Double = 0.0
var auxSumatoriaCalificacion = 0
var SumatoriaCalificacion: Double = 0.0
var alumnos =arrayListOf("José","Alberto" , "Laura" , "Noel" , "Erika" , "Daniel")
var calificaciones = doubleArrayOf(96.0, 95.0 , 99.5 , 95.0 , 46.5 , 48.0)
fun main(){



while (auxSumatoriaCalificacion != alumnos.size){

     SumatoriaCalificacion += calificaciones[auxSumatoriaCalificacion]

     promedioCalificacion = SumatoriaCalificacion / calificaciones.size





     auxSumatoriaCalificacion += 1

     if (auxSumatoriaCalificacion == alumnos.size){
        println(promedioCalificacion)
     }



}

}









