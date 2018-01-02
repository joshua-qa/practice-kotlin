import java.util.Scanner

fun main(args: Array<String>) {
    val scan: Scanner = Scanner(System.`in`)
    var n = scan.nextInt();

    for(i in 1..n) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }
}