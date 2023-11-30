import db.DatabaseConnection
import logger.LoggerManager
import runnable.Runnable

fun main(args: Array<String>) {
    DatabaseConnection.connect()
    LoggerManager.connectLogger()

    someFun(object : Runnable {
        override fun run(name: String) {
            println(name)
        }
    })

    val animals = listOf("cat", "dog", "elephant", "lion")
    val filteredAnimals = animals.filter { it.length < 5 }
    println(filteredAnimals)

    val letters = listOf('a', 'b', 'c', 'd', 'e')
    val lettersInBinary = letters.map { letter -> letter.code }
    println(lettersInBinary)
}

fun someFun(runnable: Runnable) {
    runnable.run("Hello, World")
}