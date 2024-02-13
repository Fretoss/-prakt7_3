import kotlin.math.*
fun main ()
{
    try {
        println("Введите первый радиус")
        var r1 = readLine()!!.toDouble()
        println("Введите второй радиус")
        var r2 = readLine()!!.toDouble()
        var itog = when {
            r1<0 || r2<0 -> println("Радиус не может быть отрицательным")
            r1>=r2 -> println("Внутренний радиус должен быть меньше внешнего")
            else -> Math.PI *(r2 *r2-r1*r1)
        }
        println("Площадь = ${String.format("%.2f",itog)}")
    }catch (e:Exception) { println("Введено неверное значение")}
}