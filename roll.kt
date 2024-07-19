import kotlin.random.Random
import kotlin.system.exitProcess

fun main(){
    print("Enter your Name: ")
    val playerName = readLine() ?: "Player"
    welcomePlayer(playerName)
    simulateDiceRoll()
    exitProcess(0)
}

fun welcomePlayer(name: String){
    println("Welcome, $name, to the Dice Roll game")
}

fun simulateDiceRoll(){
    println("Rolling the dice...")
    Thread.sleep(1000)
    var diceResult = Random.nextInt(1 , 7)
    println("You rolled a $diceResult")
}