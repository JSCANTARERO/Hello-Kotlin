import kotlin.random.Random

fun main() {

    // Object for the random resource
    val random = Random

    //GoldPocket, Thirst, Fatigue
   val BobClassObject = BobClass(random.nextInt(3),0,random.nextInt(5))
    //BobClassObject.show()

    val MineClassObject = MineClass()


    BobClassObject.show()

for(num in 1..20) {

    // Si Bob esta recolectando las pepitas de oro
    if (BobClassObject.GoldPocket < 3) {
        BobClassObject.GoldPocket = (MineClassObject.GoldPocketFun(BobClassObject.GoldPocket))
        BobClassObject.Thirst = (MineClassObject.ThristyFun(BobClassObject.Thirst))
        BobClassObject.Fatigue = (MineClassObject.FatigueFun(BobClassObject.Fatigue))
        println("Minero Bob: Recolectando una pepita de oro, oro actual : ${BobClassObject.GoldPocket}")
        Thread.sleep(1000)
    } else {
        println("Minero Bob: Voy para el banco, si señor")
        Thread.sleep(1000)
        BobClassObject.GoldPocket = (MineClassObject.GoldPocketFun(BobClassObject.GoldPocket))
        println("Minero Bob: Depositando el oro en el banco. Total de oro ahorrado: ${MineClassObject.total} ")
        Thread.sleep(1000)

        // Si la fatiga de Bob es mayor o igual a 8 ira a descansar a casa y volvera con la fatiga en 0
        if (BobClassObject.Fatigue >= 8) {
            BobClassObject.Fatigue = (MineClassObject.FatigueFunBank(BobClassObject.Fatigue))
            println("Minero Bob: Me siento muy cansado. Iré a descansar.")
            Thread.sleep(1000)
            println("Minero Bob: De camino a mi hogar dulce hogar.")
            Thread.sleep(1000)
            println("Minero Bob: Hogar dulce hogar.")
            Thread.sleep(1000)
            println("Minero Bob: Zzzzz...")
            Thread.sleep(1000)
            println("Minero Bob: De regreso a la mina.")
            Thread.sleep(1000)
        }

    }

        // Si bob se pone sediento
        if (BobClassObject.Thirst >= 5) {
            println("Minero Bob: Hombre, estoy sediento. Me dirijo a la taberna.")
            Thread.sleep(1000)
            BobClassObject.Thirst = (MineClassObject.ThristyFun(BobClassObject.Thirst))
            // Revisamos que luego de la taverna esta lo suficiente descansado para vover a la mina
            if (BobClassObject.Fatigue >= 10) {
                BobClassObject.Fatigue = (MineClassObject.FatigueFun(BobClassObject.Fatigue))
                println("Minero Bob: Me siento muy cansado. Iré a descansar.")
                Thread.sleep(1000)
                println("Minero Bob: De camino a mi hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Zzzzz...")
                Thread.sleep(1000)
                println("Minero Bob: De regreso a la mina.")
                Thread.sleep(1000)
            }else{
                println("Minero Bob: De regreso a la mina.")
                Thread.sleep(1000)
            }

        }

        if (BobClassObject.Fatigue >= 10) {
            BobClassObject.Fatigue = (MineClassObject.FatigueFun(BobClassObject.Fatigue))
            println("Minero Bob: Me siento muy cansado. Iré a descansar.")
            Thread.sleep(1000)
            println("Minero Bob: De camino a mi hogar dulce hogar.")
            Thread.sleep(1000)
            println("Minero Bob: Hogar dulce hogar.")
            Thread.sleep(1000)
            println("Minero Bob: Zzzzz...")
            Thread.sleep(1000)
            println("Minero Bob: De regreso a la mina.")
            Thread.sleep(1000)
        }

    }
}






/*
    for(num in 1..10){
        // Sendig Parameters to the Function in MineClass, But this one just print but is not changing the values of Bob States
        BobClassObject.GoldPocket = (MineClassObject.GoldPocketFun(BobClassObject.GoldPocket))
        BobClassObject.Thirst = (MineClassObject.ThristyFun(BobClassObject.Thirst))
        BobClassObject.Fatigue =(MineClassObject.FatigueFun(BobClassObject.Fatigue))

        BobClassObject.show()
    }
*/



