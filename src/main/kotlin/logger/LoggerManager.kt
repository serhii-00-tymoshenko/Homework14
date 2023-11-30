package logger

object LoggerManager {
    private val logger: Logger by lazy {
        println("logger was connected")
        Logger()
    }

    fun connectLogger(): Logger = logger
}