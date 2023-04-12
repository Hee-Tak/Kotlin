//고차함수 정의 : 다른 함수를 인자로 받거나, 함수를 반환하는 함수
// 람다식 정의 : 함수를 표현하는 간결한 방법
// 람다식 : {파라미터 목록 -> 함수 본문} //함수형 프로그래밍을 지원하는 중요한 기능 중 하나

fun main() {
    val triple: (Int) -> Int = { a: Int -> a*3}
    val double1: (Int) -> Int = {it * 2}
    println(triple(5))
    println(double1(34))
    println("=========================")
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 20
    )
    peopleAges.put("ABC", 2)
    peopleAges["CDE"] = 6
    peopleAges.filter{it.key.length < 4}
    println(peopleAges)
    println("=========================")
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println("=========================")
    println(peopleNames.sortedWith{str1: String, str2: String -> str1.length - str2.length})
    // 길이에 따라 정렬

    //예전에 Tip Time 에서 했던거 중
    //calculateButton.setOnClickListener{calculateTip()}
    //calculateButton.setOnClickListener(object: View, OnClickListener {
    //  override fun onClick(view: View?) {
    //      calculateTip()
    //  }
    // }) //이거를 아래의 람다식으로 short form(짧은 형태) 으로 구현할 수 있다.

    //calculateButton.setOnClickListener{ view -> calculateTip() }
    //근데 여기서 view 매개변수는 람다에서 사용되지 않으므로 생략해도 되어서 맨 처음에 저 형태로 되는 것

}
