/**
 * 4 - Desenvolva um programa em Kotlin que leia dois números inteiros e mostre o somatório entre eles.
 * Ex:
 * Digite um valor: 8
 * Digite outro valor: 5
 * A soma entre 8 e 5 é igual a 13.
 *
 */



fun main(){
    println("Digite o primeiro numero.")
    var num1 = readLine()!!.toDouble()
    println("Digite o segundo numero.")
    var num2 = readLine()!!.toDouble()

    var soma = num1 + num2

    println("A soma de $num1 + $num2 é = $soma ")

}