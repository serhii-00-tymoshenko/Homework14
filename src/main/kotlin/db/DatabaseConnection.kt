package db

class DatabaseConnection {
    companion object {
        const val URL = "https://www.google.com/"

        fun connect() {
            println("Successfully connected to $URL")
        }
    }
}