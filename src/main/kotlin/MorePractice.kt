fun main(){
    // init {
//
// }
    //lateinit - only var


    // empty constructor plus getters and setters
    class Duck(var name: String, var weight_param: Int){
        fun quack(){
            println("Quack! Quack! Quack!")
        }
        val weightInKgs: Double
        get() = weight_param * 2.2

        var weight = weight_param
        set(value){
            if (value > 0) field = value
        }
    }

    var myDuck = Duck("Timmy", 5)
    myDuck.quack()
    //print(myDuck.weightInKgs)
    myDuck.weight = -1
    println(myDuck.weight)


}