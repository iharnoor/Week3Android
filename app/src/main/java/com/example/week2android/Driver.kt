package com.example.week2android

object Driver {

    fun performTask(callback: Callback) {
        // Simulating some task
        val result = "Task completed successfully"
        callback(result)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // optionals concept
        val first: String? = null
        println(first!!.length)

        // Immutables vs Mutables
        val result = performOperation(10, 5) {
                a, b -> a - b
        }
        println("Result of subtraction: $result") // Output: Result of
    }


    fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

typealias Callback = (String) -> Unit