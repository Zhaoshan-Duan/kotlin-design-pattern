package Creational.Factory

class Burger(var ingredients: List<String>){
    fun print(){
        print(ingredients)
    }
}
class BurgerFactory {
    fun createCheeseBurger(): Burger {
        val ingredients = listOf("bun", "cheese", "beef-patty")
        return Burger(ingredients)
    }

    fun createDeluexCheeseBurger(): Burger{
        val ingredients = listOf("bun", "tomatoe", "lettuce", "cheese", "beef-patty")
        return Burger(ingredients)
    }

    fun createVeganBurger(): Burger {
        val ingredients = listOf("bun", "special-sauce", "veggie-patty")
        return Burger(ingredients)
    }
}