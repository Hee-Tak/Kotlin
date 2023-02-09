open class Item(val name: String, val price: Int)
// Item은 상위 클래스이고, 서브클래스가 상위 클래스에서 확장되므로
// 클래스는 open 키워드와 함께 표시
// 서브클래스 써먹으려면 상위클래스에다가 open 달아야한다 뭐 그런의미인듯

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name
    }
    //kotlin 에서는 모든 클래스가 자동으로 toStirng() 메서드를 상속한다.
}
/*
class Vegetables(val topping1: String,
                 val topping2: String,
                 val topping3: String) : Item("Vegetables", 5){ */
//class Vegetables(val toppings: List<String>) : Item("Vegetables", 5) {
class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String{
        //return name+"$price"
        //return name
        //return name + " " + toppings.joinToString()
        //joinToString() 메소드를 사용하여 모든 toppings을 단일 문자열로 결합.
        // joinToString() <- 이 안에 구분자를 넣어서 구분자 지정해줄 수 있음 ex) joinToString(" ")
        if(toppings.isEmpty()) {
            return "$name Chef's Choice"
        } else {
            return name + " " + toppings.joinToString()
        }

    } //모든 프로퍼티를 출력해주고싶다거나 원하는 출력 형태가 있다면
    //toString을 오버라이딩해서 직접 구현해주면 된다.
}
//* vararg : 가변인자. 매개변수 하나만 vararg로 표시할 수 있으며 이는 일반적으로 목록의 마지막 매개변수다.
// 내가 생각했을땐 얘는 인자의 갯수가 변할수있는거. 그걸 말하는거같음
// var 은 인자의 값이 변하는 문제고

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order{
        itemList.add(newItem)
        return this
        //this : 현재 객체 인스턴스
    }

    fun addAll(newItems: List<Item>): Order{
        itemList.addAll(newItems)
        return this
    }

    fun print(){
        println("Order #${orderNumber}")
        var total = 0
        for(item in itemList){
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }

}


fun main() {
    /*
    val noodles = Noodles()
    //val vegetables = Vegetables(listOf("Cabbage", "Sprouts", "Onion"))
    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
    val vegetables2 = Vegetables()

    println(noodles)
    //println(noodles.toString()) //흠 신기하네
    println(vegetables)
    //println(vegetables.toString()) //출력할때 toString 알아서 붙어서 되는구만
    println(vegetables2)
    */

    val ordersList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    //order1.print()
    ordersList.add(order1)

    //println()

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    //order2.print()
    ordersList.add(order2)

    //println()

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    //order3.print()
    ordersList.add(order3)

    //이러한 호출을 연결하는 것이 필수는 아니지만, 함수의 반환 값을 활용하는 일반적이고 권장되는 방법
    val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach"))
    )


    for(order in ordersList) {
        order.print()
        println()
    }
}