open class pesawat{
    val sayap:Int=2

    open fun terbang(){
        println("terbang..")
    }

    fun mendarat(){
        println("mendarat..")
    }
}

class pesawatTempur : pesawat(){
    val rudal:Int=2

    fun manuver(){
        println("manuver..")
    }

    override fun terbang() {
        println("terbang ala tempur")
    }
}

fun main(args: Array<String>) {
    var boing=pesawat()
    var f16=pesawatTempur()

    boing.terbang()

    boing.mendarat()

    f16.terbang()

    f16.mendarat()

    f16.manuver()
}