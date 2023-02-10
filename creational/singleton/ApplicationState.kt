package creational.singleton

class ApplicationState(
    var isLoggedIn: Boolean = false
) {
    private var instance = null
    fun getAppState(){

    }
}

fun main(){
    val appState = ApplicationState.getAppState()
}