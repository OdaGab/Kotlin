/**
 * 9	Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em R$)
 *      e mostre quantos dólares ela pode comprar.
 *      Considere US$1,00 = R$3,45. (ou cotação atual)
 */

fun main(){

    println("Quanto voce tem em sua carteira? (em Reais)")
    var reais:Double = readLine()!!.toDouble()

    var dolar = (reais * 3.45)

    print("$reais real é igual a " + String.format("%.2f", dolar) + " Dolar")

}