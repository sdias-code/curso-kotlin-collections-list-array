package one.digitalinnovation.collections

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "João"
    nomes[1] = "Roberto"
    nomes[2] = "Gustavo"

    nomes.forEach {
        println(it)
    }

    println("----------------")
    nomes.sort()
    for(nome in nomes){
        println(nome)
    }

    println("----------------")
    val apelidos = arrayOf("Zoiúdo", "Dedezinho", "Bicudinho")
    apelidos.sort()
    apelidos.forEach {
        println(it)
    }
}