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

    var point = Point(10, 20)

    var a = point.x;

    println(a)

    // enum class (Java는 enum으로 쓰지만 kotlin은 enum class로 써야한다)
    println(Color.BLUE.rgb())
}

fun isOdd(x: Int): Boolean {
    return x % 2 == 1
}

class Point(var x: Int, var y: Int)

enum class Lang {
    JAVA, CLANG, CPP, KOTLIN, RUST, SWIFT
}

enum class Color(
    val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0), ORANGE(255,165, 0),
    YELLOW(255,255,0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}