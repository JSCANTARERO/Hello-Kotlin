val credits: String = """
    Owner: Jorge Abraham Sanchez
    Identity: 1006200000192
    Place: Siguatepeque, Comayagua 
    Date 'n' time: 16/10/19 7:07pm
""".trimIndent()

var greetings: String? = null

fun main() {
    println(credits)
    //println("Hello world")
    /*val name: String = "George"
    var counter: Int = 0
    do{
        println(name)
        println(credits)
        //counter ++

        when(greetings) {
            null -> println("\nHi")
            else -> println(greetings)
        }
        Thread.sleep(10000)
    }while (counter != 1)*/

    //propiedades o caracteristicas

    //var objectName: Class = Initialize

    var ferrari: Car = Car()
    ferrari.turnOn()

}

class Car{
    var mark: String = ""
    var color: String = ""
    var price: Int = 0
    var maxSpeed: Int = 0
    var fuel: Int = 20
    var distance: Int = 0
    var speed: Int = 0
    var time: Int = 0

    fun turnOn(){
        println("\nThe car has turned on")
        println("The fuel tank is full")
        do {
            println("\n")
            accelerate()
            distance = distance + (speed * 5)
            println("The car's speed is: $speed m/s")
            println("$time seconds have passed")
            time = time + 10
            println("Distance traveled: $distance")
            fuel = fuel -5
            println("The fuel tank have: $fuel")
            speed = speed + 5
            if(speed >= 30)
            {
                println("Max speed reached")
                speed = 30
            }
            Thread.sleep(10000)
        }while (fuel > 0)
        if(fuel == 0)
        {
            println("The fuel tank is empty")
            turnOff()
            stop()
        }
    }
    fun turnOff(){
        println("The car has turned off")
    }
    fun accelerate(){
        println("The car is accelerating")
    }
    fun stop(){
        println("The car has stopped")
    }
}