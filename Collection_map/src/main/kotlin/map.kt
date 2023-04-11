fun main() {
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )

    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges)

    /*
    peopleAges.forEach{print("${it.key} is ${it.value}, ")}
    //자동으로 모든 항목을 탐색한 후 항목별로 작업을 실행하는 forEach
    // for와 비슷하지만 조금 더 컴팩트함.
    */
    println(peopleAges.map{"${it.key} is ${it.value}"}.joinToString(", "))

    val filterNames = peopleAges.filter{it.key.length < 4}
    println(filterNames)

}
