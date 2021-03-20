package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 1000.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it.nome) }

    println("--------mutableListOf----------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it.nome) }

    println("-------REMOVE JOAO-----------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it.nome) }

    println("--------mutableSetOf----------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it.nome) }

    println("--------ADD PEDRO E MARIA----------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it.nome) }

    println("--------REMOVE MARIA----------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it.nome) }

}