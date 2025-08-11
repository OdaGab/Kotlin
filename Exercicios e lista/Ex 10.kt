/**
 * 10	Faça um programa em kotlin que leia a largura e altura de
 *      uma parede,
 *      calcule e mostre a área a ser pintada e a quantidade
 *      de tinta necessária para o serviço,
 *      sabendo que cada litro de tinta pinta uma área de
 *      2 metros quadrados.
 */


fun main(){
    println("Digite a Largura e a Altura da Parede:")
    println("Digite a Largura da Parede:")
    var largura:Double = readLine()!!.toDouble()
    println("Agora Digite a Altura da Parede")

    var altura:Double  = readLine()!!.toDouble()
    var area = largura * altura
    var quantidadeDeTinta:Double = area / 2

    println("Área a ser pintado = $area Metros")
    println("Quantidade de tinta necessaria é = $quantidadeDeTinta Litros")

}