//고차함수 정의 : 다른 함수를 인자로 받거나, 함수를 반환하는 함수

fun main() {
    val triple: (Int) -> Int = { a: Int -> a*3}
    println(triple(5))
}