fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

    val filteredWords = words.filter{ it.startsWith("b", ignoreCase = true)}
    println(filteredWords)

    val filteredWords1 = words.filter{ it.startsWith("b", ignoreCase = true)}
        .shuffled() //단어 순서 무작위로 섞기
    println(filteredWords1)

    val filteredWords2 = words.filter{ it.startsWith("b", ignoreCase = true)}
        .shuffled()
        .take(2) //2개만 갖고오기
    println(filteredWords2)

    val filteredWords3 = words.filter{ it.startsWith("b", ignoreCase = true)}
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords3)

    val filteredWords4 = words.filter{ it.startsWith("b", ignoreCase = true)}
        .shuffled()
        .take(1)
    println(filteredWords4)
}