fun main(args: Array<String>) {
    val entrees = mutableListOf<String>() // 변경 가능한 list라 타입을 명시해주어야 함.
    val entrees1: MutableList<String> = mutableListOf() //변수의 데이터 유형을 미리 지정하여 명시할 수도 있음

    // Add individual items using add()
    println("Entrees: $entrees") //현재 빈 목록
    println("Add noodles: ${entrees.add("noodles")}") //성공적으로 add 된다면 true를 반환
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    // Add a list of items using addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine") //변경하지 않아도 되므로 이렇게 만듦
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    //entrees.add(10) //error

    // Remove an item using remove()
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    println("Remove item that doesn't exist: ${entrees.remove("rice")}") //false
    println("Entrees: $entrees")

    // Remove an item using removeAt() with an index
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    // Clear out the list
    entrees.clear()
    println("Entrees: $entrees")

    // Check if the list is empty
    println("Empty? ${entrees.isEmpty()}") //true



}