fun main() {
    val name = "Jacek"
    val border = "="
    val timesToRepeat = 21 + name.length
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, ${name}!  ")
    printBorder(border, timesToRepeat)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}
