fun main(args: Array<String>) {
    var inova = classMObil()
    var avanza = classMObil()

    println("nilai sebelum berubah")
    println("mesin avanza = "+avanza.mesin)
    println("mesin inova = "+inova.mesin)
    println()

    println("nilai setelah berubah")
    avanza.mesin=1
    println("mesin avanza = "+avanza.mesin)
    println("mesin inova = "+inova.mesin)
    println()

    println("nilai sebelum berubah")
    println("Roda avanza= "+avanza.roda)
    println("Roda inova= "+inova.roda)
    println()

    println("nilai setelah berubah")
    avanza.roda = 5
    println("Roda avanza= "+avanza.roda)
    println("Roda inova= "+inova.roda)
    println()

    println("Body avanza= "+avanza.body)
    println("Body inova= "+inova.body)
    println()
}