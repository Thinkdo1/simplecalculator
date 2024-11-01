import kotlin.math.sqrt

fun main() {
    while (true) {
        println("Choose an operation:")
        println("press 1,  for Sum")
        println("press 2, for Multiplication")
        println("press 3, for Division")
        println("press 4, for subtraction")
        println("press 5, to calculate quadratic problem")
        println("press 6, to  Exit")

        val choice = readln().toIntOrNull()

        when (choice) {
            1 -> sum()
            2 -> mul()
            3 -> div()
            4 -> dif()
            5 -> qua()
            6 -> {
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
        val input = readln().toDoubleOrNull()
        if (input == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }
        if (input == 0.0) break
        summation += input
    }

    println("The sum is: $summation")
}

fun mul(){
    println("please enter a number and to see result press 1")//since 1 can't affect multiplication
    var multiplication=1.0


    while (true) {
        val input= readln().toDoubleOrNull()
        if (input==null)
        {
            println("Invalid input . please enter valid number")
            continue
        }
        if(input==1.0)break
        multiplication *= input
    }
    println("the multiplication is: $multiplication")


}
fun div() {
    println("Please enter a number to start ")
    var division = readln().toDoubleOrNull() ?: return println("Invalid input. Please enter a number.")

    while (true) {
        println("Enter another number and press 1 to see result ):")
        val input = readln().toDoubleOrNull()
        if ( input== null) {
            println("Invalid input. Please enter a number.")
            continue
        }
        if (input== 1.0) break
        if (input== 0.0) {
            println("Cannot divide by zero. Please enter a different number.")
            continue
        }
        division /= input  }

    println("The result is: $division")
}


fun dif() {
    println("Please enter numbers to subtract ")
    var difference  = readln().toDoubleOrNull() ?: return println("Invalid input. Please enter a number.")

    while (true) {
        println("Enter another number and enter 0 to see result):")
        val input = readln().toDoubleOrNull()

        if (input == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }
        if (input == 0.0) break
        difference -= input
    }

    println("The difference is: $difference")
}
fun qua(){
    println("please enter a,b,c")
    val a= readln().toDoubleOrNull() ?: return println("Invalid input. Please enter a number.")
    val b= readln().toDoubleOrNull() ?: return println("Invalid input. Please enter a number.")
    val c= readln().toDoubleOrNull() ?: return println("Invalid input. Please enter a number.")
  val discriminant=(b * b)-(4 * a * c)
    if (discriminant>0.0)
    {
       val result1=(-b + sqrt(discriminant))/(2 * a)
       val result2=(-b - sqrt(discriminant))/(2 * a)
        println("the possible results are $result1 ,$result2")
    }
    else if (discriminant==0.0)
    {
        val result=-b /(2 * a)
        println("the possible result is $result")
    }
    else
    {
        val realpart=-b /(2 * a )
        val imaginarypart= sqrt(-discriminant)/ (2 * a)
        println("the real part is $realpart and imaginarypart=$imaginarypart i")
    }
}