fun main() {
    val applePrice = 67
    val appleAmount = 7

    var totalPrice = applePrice * appleAmount

    totalPrice += (totalPrice * 0.05).toInt()

    println("Общая стоимость с налогом 5%: $totalPrice руб.")
}