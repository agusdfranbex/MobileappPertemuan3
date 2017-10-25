class classmobil3{
    companion object{
        @JvmField var pintu = 2

        fun bukapintu(){
            println("buka pintunya... ")
        }
        var roda = 4
        var mesin = 1
        var body = 1
    }
}

fun main(args: Array<String>) {
    var avanza=classmobil3
    println("mesin = "+avanza.mesin)
    classmobil3.bukapintu()
}