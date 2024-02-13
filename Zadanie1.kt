fun main(){
    try {
        println("Введите первое сопротивление")
        var R1 = readLine()!!.toDouble()
        println("Введите второе сопротивление")
        var R2 = readLine()!!.toDouble()
        println("Введите третье сопротивление")
        var R3 = readLine()!!.toDouble()
        var total = 1/(1/R1 + 1/R2 + 1/R3)
        println("Сопротивление соединения:${String.format("%.2f",total)}")
    }catch (e:Exception){println("Введено неверное значение")}
}