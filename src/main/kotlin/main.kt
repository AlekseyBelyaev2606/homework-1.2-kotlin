package ru.netology

fun main() {
    val minCom = 35
    val perCom = 0.75
    var sumPay: Int = 0
    var amount: Double = 0.00

    fun moneyVK(){
        if((sumPay * perCom) > minCom){
             amount = sumPay * perCom
         }
        else{
            amount = minCom.toDouble()
         }
    println(amount)
    }

    var likes: Int = 0
    var likesChoice: String

    fun sumLikes(){
        if ((likes % 10 == 1) && (likes % 200 != 11)){
            likesChoice = "человеку"
        }
        else{
            likesChoice = "людям"
        }
        println("Понравилось " + likes + " " + likesChoice)
    }

    var sumShop: Int = 0
    val sumDis: Int = 100
    val perDis: Int = 5
    val melDis: Int = 1
    var Shop: Boolean = false

    fun sumDis(){
        if ((sumShop > 0) && (sumShop < 10001)){
            sumShop -= sumDis
        }
        else{
            sumShop = sumShop * (100 - perDis) / 100
        }
        if (Shop == true){
            sumShop = sumShop * (100 - melDis) / 100
        }
    }

}