fun main() {
    try {
        var y = readLine()!!.toDouble()
        var result = when {
            y > 2 -> y + 2
            y < 1 -> y * y + 2 * y + 0.3
            y in 1.0..2.0 -> y * y * y + 2 * y * y + 0.3 * y + 1
            else ->println("Недопустимое значение y")
        }
        println("Результат: $result")
    }catch (e:Exception) {
        println("Введено неверное значение")}
}