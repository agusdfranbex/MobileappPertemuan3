class mobil5(val mesin: Int){
    constructor(roda : Int, body : Int):this(5){
        println("hasil cetakan : ")
        println("mesin : ${this.mesin}, roda : $roda, body : $body")
    }
}

fun main(args: Array<String>) {
    var avanza = mobil5(2,4)
}