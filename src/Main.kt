
fun main() {
    while (true) {
        println("Choose an operation:")
        println("press 1,  for Sum")
        println("press 2, for Multiplication")
        println("press3, for Division")
        println("press 4, for subtraction")
        println("press 5, to  Exit")

        val choice = readln().toIntOrNull()

        when (choice) {
            1 -> sum()
            2 -> mul()
            3 -> div()
            4 -> dif()
            5 -> {
                println("Exiting...")
                return
            }
            else -> println("Invalid choice. Please select a number between 1 and 5.")
        }
    }
}


fun sum() {
    println("Please enter numbers to sum press 0 to see result):")// since 0 can't affect summation
    var summation = 0.0
// while(true) means it will loop till break occur
    while (true) {
        val input = readln()
        val number = input.toDoubleOrNull()
        if (number == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }
        if (number == 0.0) break
        summation += number
    }

    println("The sum is: $summation")
}

fun mul(){
    println("please enter a number and to see result press 1")//since 1 can't affect multiplication
    var multiplication=1.0


    while (true) {
        val input1= readln().toDoubleOrNull()
        if (input1==null)
        {
            println("Invalid input . please enter valid number")
            continue
        }
        if(input1==1.0)break
        multiplication *= input1
    }
    println("the multiplication is: $multiplication")


}
fun div() {
    println("Please enter a number to start and  press 1 to see result")
    var result = readln().toDoubleOrNull() ?: return println("Invalid input. Please enter a number.")

    while (true) {
        println("Enter another number (press 1 to finish):")
        val input = readln()
        val c = input.toDoubleOrNull()
        if (c == null) {
            println("Invalid input. Please enter a number.")
            continue
        }
        if (c == 1.0) break
        if (c == 0.0) {
            println("Cannot divide by zero. Please enter a different number.")
            continue
        }
        result /= c
    }

    println("The result is: $result")
}


fun dif() {
    println("Please enter numbers to subtract (enter 0 to finish):")
    var difference  = readln().toDoubleOrNull() ?: return println("Invalid input. Please enter a number.")

    while (true) {
        println("Enter another number (enter 0 to finish):")
        val input3 = readln().toDoubleOrNull()

        if (input3 == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }
        if (input3 == 0.0) break
        difference -= input3
    }

    println("The difference is: $difference")
}
