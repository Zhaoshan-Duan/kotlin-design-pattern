package creational.builder

class Burger(){
    lateinit var buns: String
    lateinit var patty: String
    lateinit var cheese: String
    fun setBuns(bunStyle: String) {
        buns = bunStyle
    }
    fun setPatty(pattyStyle: String) {
        patty = pattyStyle
    }

    fun setCheese(cheeseStyle: String) {
        cheese = cheeseStyle
    }
}

class BurgerBuilder {
    val burger = Burger()

    fun addBuns(bunStyle: String): BurgerBuilder {
        burger.setBuns(bunStyle)
        return this
    }
    fun addPatty(pattyStyle: String): BurgerBuilder {
        burger.setPatty(pattyStyle)
        return this
    }

    fun addCheese(cheeseStyle: String): BurgerBuilder{
        burger.setCheese(cheeseStyle)
        return this
    }

    fun build(): Burger{
        return burger
    }

}

fun main(){
    val burger = BurgerBuilder()
        .addBuns("sesame")
        .addPatty("fish-patty")
        .addCheese("swiss cheese")
        .build()

    print(burger)
}