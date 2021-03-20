package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 5
    values[4] = 4

//    for (valor in values){
//        println(valor)
//    }

//    values.forEach {
//        println(it)
//    }

//    values.forEach { valor ->
//        println(valor) }

    values.sort()
    for(index in values.indices){
        println("Indice: $index Valor: ${values[index]}")
    }

}