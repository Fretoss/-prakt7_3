fun main() {
    try {
        println("x")
        var x = readLine()!!.toInt()
        println("y")
        var y = readLine()!!.toInt()
        when (x>=-3&&x<=1&&y>=-1&&y<=1)
        {
            true -> println("Заданная точка ($x,$y) принадлежит А")
            false -> println("Заданная точка ($x,$y) не принадлежит А")
        }
        when (x>=-1&&x<=1&&y>=-2&&y<=2) {
            true -> println("Заданная точка ($x,$y) принадлежит Б")
            false -> println("Заданная точка ($x,$y) не принадлежит Б")
        }
        when (x>=-1&&x<=1&&y>=-1&&y<=2) {
            true -> println("Заданная точка ($x,$y) принадлежит В")
            false -> println("Заданная точка ($x,$y) не принадлежит В")
        }
        when (x>=-2&&x<=1&&y>=-2&&y<=1) {
            true -> println("Заданная точка ($x,$y) принадлежит Г")
            false -> println("Заданная точка ($x,$y) не принадлежит Г")
        }
    }catch (e:Exception) {
        println("Введено неправильное значение")}
}