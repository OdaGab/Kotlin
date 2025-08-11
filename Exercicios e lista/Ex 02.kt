/**
 * 2	Faça um programa que leia o nome de uma pessoa e
 * mostre uma mensagem de boas-vindas para ela:
 * Ex:
 * Qual é o seu nome? Johann Gabriell
 * Olá Johann Gabriel, é um prazer conhecer-te!
 *
 */

fun main(){
    println("Digite Seu nome")
    val name = readln()
    print("Olá $name, é um prazer conhecer-te!")
}