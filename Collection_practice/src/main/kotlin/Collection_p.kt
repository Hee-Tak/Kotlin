fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list: ${numbers}")
    println("sorted: ${numbers.sorted()}")

    val setOfNumbers = numbers.toSet()
    println("set: ${setOfNumbers}") //집합. list에서 중복제거를 한 것을 확인

    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2 : ${set1 == set2}") //집합(set)이므로 순서 상관x 를 의미
    println("contains 7: ${setOfNumbers.contains(7)}") // false

    val set3 = setOf(6, 8, 14, 17, 13, 5)
    val set4 = setOf(14, 16, 5, 7, 2, 6, 3)
    println("$set3 unions $set4 : ${set3.union(set4).sorted()}")
    println("$set3 intersect $set4 : ${set3.intersect(set4).sorted()}")
}