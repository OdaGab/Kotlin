fun main(){
/*
    Var
    Define uma variável mutável, ou seja, cujo valor pode ser alterado
    É a abreviação de "variável"
    Pode ser atribuída diversas vezes
    Val
    Define uma variável imutável, ou seja, cujo valor não pode ser alterado
    É a abreviação de "valor"
    Pode ser inicializada apenas uma vez
*/
    // Exemplo var

    var nome = "Odair Gabriel"
    println("Meu nome é $nome")

    nome = "Odair"
    println("Meu nome é $nome")

/*
    Exemplo val
    Neste trecho de código tem um erro de compilação
    mensagem de erro
    Kotlin: 'val' cannot be reassigned.


    val nome = "Odair Gabriel"
    println("Meu nome é $nome")

    nome = "Odair"
    println("Meu nome é $nome")
    */
}