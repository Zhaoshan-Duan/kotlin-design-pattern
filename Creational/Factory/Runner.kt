package Creational.Factory

fun main(){
    BurgerFactory().createCheeseBurger().print()
    BurgerFactory().createDeluexCheeseBurger().print()
    BurgerFactory().createVeganBurger().print()
}