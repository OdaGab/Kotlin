/**
 * 7 Crie um programa em Kotlin que leia um número real e mostre na tela o seu dobro
 *   e a sua terça parte.
 *   Ex: Digite um número: 3.5
 *       O dobro de 3.5 é 7.0
 *       A terça parte de 3.5 é 1.16666
 */

fun main(){
    println("Digite um numero real")
    var num:Double = readLine()!!.toDouble()

    var dobro = num * 2
    var terca: Double = num / 3

    var tercaF = String.format("%.2f", terca).toString()

    println("O dobro de $num é $dobro " +
            "\nA terça parte de $num é $tercaF" )

}