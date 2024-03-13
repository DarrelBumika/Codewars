// Latihan Codewars
// #2 : Multiplication table
// https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08

fun multiplicationTable(size: Int) = (1..size).map { x -> (1..size).map { it * x }.toIntArray() }.toTypedArray()

fun main() {
    multiplicationTable(3).forEach { print("[ "); it.forEach { x -> print("$x ") }; print("]") } // [ 1 2 3 ][ 2 4 6 ][ 3 6 9 ]
    println()
    multiplicationTable(3).forEach { print("[ "); it.forEach { x -> print("$x ") }; print("]") } // [ 1 2 3 ][ 2 4 6 ][ 3 6 9 ]
    println()
    multiplicationTable(3).forEach { print("[ "); it.forEach { x -> print("$x ") }; print("]") } // [ 1 2 3 ][ 2 4 6 ][ 3 6 9 ]
    println()
}