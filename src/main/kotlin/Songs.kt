class Song (val title: String, val artist: String){
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing $title")
    }
}

fun main(){
    // a data about the class - its object properties
    // a things an object can do - its functions
    /* class Dog (val name: String, var weight: Int, val breed: String){
        fun bark(){
            println(if (weight < 20) "Yip" else "Woof")
        }
    }
    var myDog = Dog ("Cody", 50, "German shepard")
    myDog.weight = 55
    println(myDog.weight)
    myDog.bark()

    var dogs: Array<Dog> = arrayOf(Dog("Biba",55, "Mixed"), Dog("Buba", 15, "Poodle"))
    println(dogs.size)
    dogs[1].weight = 66
    println(dogs[1].weight) */

    val songOne = Song ("Symphony of Destruction", "Megadeth")
    val songTwo = Song ("Seek and Destroy", "Metallica")
    val songThree = Song ("The ~Black Parade", "My Chemical Romance")
    songOne.play()
    songTwo.stop()
    songThree.play()

}
