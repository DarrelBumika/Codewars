// Latihan Codewars
// #3 : Steps in k-primes
// https://www.codewars.com/kata/5a48948e145c46820b00002f

fun kprimesStep(k: Int, step: Int, start: Long, nd: Long): List<LongArray> {
    val result = mutableListOf<LongArray>()
    fun countK(n: Long): Int {
        var varn = n
        var count = 0
        var i = 2
        while (i * i <= varn) {
            while (varn % i == 0L) {
                count++
                varn /= i
            }
            i++
        }
        if (varn > 1) count++
        return count
    }
    (start..(nd - step)).forEach {
        if ((countK(it) == k) && (countK(it + step) == k)) result.add(longArrayOf(it, it + step))
    }
    return result
}

fun main() {
    kprimesStep(2, 2, 0, 50).forEach { print("[ "); it.forEach { x -> print("$x ") }; print("]") } // [ 4 6 ][ 33 35 ]
}