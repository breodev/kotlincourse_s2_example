//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    while (true) {
        print("Enter your age: ")
        val ageInput = readLine()
        val age = ageInput?.toIntOrNull() ?: 0
        println("Your age is $age")
    }
}


fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun greet(name: String) {
    println("Hello, $name!")
}