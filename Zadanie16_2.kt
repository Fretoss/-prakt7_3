import kotlin.math.max
import kotlin.math.min
fun main() {
    try {
        println("Введите a")
        var a = readLine()!!.toDouble()
        println("Введите b")
        var b = readLine()!!.toDouble()
        println("Введите c")
        var c = readLine()!!.toDouble()
        println("Введите d")
        var d = readLine()!!.toDouble()
        println("Введите u")
        var u = readLine()!!.toDouble()
        println("Введите v")
        var v = readLine()!!.toDouble()
        var yu = a*u*u+b*u+c
        var yv = a*v*v+b*v+c
        var vertX = -b / (2*a)
        var vertY = a*vertX*vertX+b*vertX+c
        var minY= min(yu, yv)
        var maxY=max(yu,yv)
        var max = max(vertX,vertY)
        var min = min(vertX,vertY)
        println("Мин: $min,$minY")
        println("Макс: $max, $maxY")
    }catch (e:Exception) {println("Введено неверное значение")}
}