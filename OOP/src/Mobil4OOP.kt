class mobilinit(var mesin : Int,var roda : Int,var body : Int){
    init {
        println("Mesin mobil : $mesin, Roda mobil : $roda, Body mobil : $body")
    }
}

fun main(args: Array<String>) {
    var avanza = mobilinit(1,4,1)
    var inova = mobilinit(4,6,7)

    println("mesin avansa : "+avanza.mesin)
    println("mesin inova : "+inova.mesin)

    println("roda avansa : "+avanza.roda)
    println("roda inova : "+inova.roda)

    println("body avansa : "+avanza.body)
    println("body inova : "+inova.body)

}