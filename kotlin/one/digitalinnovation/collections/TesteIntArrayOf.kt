package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(2, 3, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("-----------------")
    values.sort() //Ordenando o array
    values.forEach {
        println(it)
    }
}