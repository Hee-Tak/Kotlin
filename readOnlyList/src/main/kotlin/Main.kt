fun main(args: Array<String>) {
    val colors = listOf("green", "orange", "blue")

    //colors.add("purple") //error
    //colors[0] = "yellow" //error -> "val colors = ..."

    println("Reversed list: ${colors.reversed()}")
    println("List: $colors")
    println("Sorted list: ${colors.sorted()}") //알파벳순 sort

    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")
}