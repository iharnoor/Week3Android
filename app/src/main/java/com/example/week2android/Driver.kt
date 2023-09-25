package com.example.week2android

object Driver {

    fun performTask(callback: Callback) {
        // Simulating some task
        val result = "Task completed successfully"
        callback(result)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        """Concept of Optionals / nullables"""
        val str: String = "Hello"
//        print(str)
        val empl: Employee? = null // ? = object can be null
//        val empl: Employee? = Employee(1,"Harry") // ? = object can be null
        // compile time error // grammar
        //print(empl.employeeId)

        // option 1
//        if (empl == null) {
//            print("empl is null")
//        } else {
//            print(empl.employeeId)
//        }

        // option 4 // no null condition
        empl?.let {
            print(empl.employeeId)
        }
        // option2
//        print(empl?.employeeId) // ? print null if null otherwise value

        // option 3
//        print(empl!!.employeeId) //i guarantee that it is never null
        // so force unwrap

        //Concept of Lamdas
        // Immutables vs Mutables
        val result = performOperation(10, 5) { a, b ->
            a - b
        }
        println("Result of subtraction: $result") // Output: Result of
    }

    fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

typealias Callback = (String) -> Unit