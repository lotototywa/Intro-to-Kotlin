fun main(){
    val name = "Jacek"
    val border = "="
    val timesToRepeat = 21 + name.length
    val age = 11
    val layers = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, ${name}!  ")
    printBorder(border, timesToRepeat)
    println("")
    printCakeCandles(age)
    printCakeTop(age)
	printCakeBottom(age, layers)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun printCakeCandles(age:Int){
    print(" ")
    repeat(age){
    	print(",")   
    }
    println()
    print(" ")
    repeat(age){
    	print("|")   
    }
    println()
}

fun printCakeTop(age:Int){
	repeat(age + 2){
        print("=")
    }
    println()
}

fun printCakeBottom(age:Int, layers:Int){
	repeat(layers){
        repeat(age + 2){
            print("@")
        }
        println()
    }
    println()
}
