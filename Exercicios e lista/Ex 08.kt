/**
 * 8   Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
 *     valores relativos em outras medidas.
 *     Ex:
 *     Digite uma distância em metros: 100
 *     Distância de 10000 Cm
 *
 *     Ajustar para outras medidas
 *
 */

fun main(){

    println("Digite uma distancia percorrida em Metros")
    var distancia = readLine()!!.toDouble()
    var centimetros = distancia * 100
    var polegadas = distancia * 39.3701 // valor da Polegada 39.3701

    println("Distancia percorrida - $distancia metros")
    println("Distancia percorrida - $centimetros Centimetros")
    println("Distancia percorrida - $polegadas Polegadas")

}