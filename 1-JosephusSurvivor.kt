// Latihan Codewars
// #1 : Josephus Survivor
// https://www.codewars.com/kata/555624b601231dc7a400017a

fun count(n: Int, k: Int): Int = if (n == 1) 0 else ((count(n - 1, k) + k) % n)

fun josephusSurvivor(n: Int, k: Int): Int = count(n, k) + 1

fun main() {
    println(josephusSurvivor(7, 3))     // 4
    println(josephusSurvivor(11, 19))   // 10
    println(josephusSurvivor(40, 3))    // 28
    println(josephusSurvivor(14, 2))    // 13
    println(josephusSurvivor(100, 1))   // 100
    println(josephusSurvivor(1, 300))   // 1
    println(josephusSurvivor(2, 300))   // 1
    println(josephusSurvivor(5, 300))   // 1
    println(josephusSurvivor(7, 300))   // 7
    println(josephusSurvivor(300, 300)) // 265
}