class Dog (val name: String, weight_param: Int, breed_param: String){
    init{
        println ("Dog $name has been created")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init{
        println("The breed is $breed")
    }

    var weight = weight_param
    set(value){
        if (value > 0) field = value
    }

    val weightInKgs: Double
    get() = weight / 2.2

    fun bark(){
        println (if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(){
    val myDog = Dog ("Fido", 70, "mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities){
        println("My dog enjoys $item")
    }

    val dogs = arrayOf (Dog ("Kelpie", 20, "German shepard"), Dog ("Ripper", 10, "Puddle"))
    dogs[0].bark()
    dogs[1].weight = 40
    println ("Weight for ${dogs[0].name} (${dogs[0].breed}) is ${dogs[0].weight}")
    println("Weight of ${dogs[1].name} has been changed to ${dogs[1].weight}")
}