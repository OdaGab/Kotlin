/**
 * 6 Faça um programa em Kotlin que leia um número inteiro e
 * mostre o seu antecessor
 *   e seu sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 *
 */

fun main(){

    println("Digite um número inteiro.")
    var num = readLine()!!.toInt()

    var  numAnt = num - 1
    var  numSuc = num + 1

    println("O antecessor de $num é $numAnt\n" +
            "O sucessor de $num é $numSuc")

}