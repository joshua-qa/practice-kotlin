fun main(args: Array<String>) {
    var x = 12;

    when(x % 2) {
        0 -> println("even")
        1 -> println("odd")
    }

    for(index in 1..x) {
        println("test " + index)
    }

    when {
        isOdd(x) -> print("odd (function)")
        else -> print("even (function)")
    }
}

fun isOdd(x: Int): Boolean {
    return x % 2 == 1
}