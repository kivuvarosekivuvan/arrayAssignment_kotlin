fun main() {
    soil("Loam", "Sand", "Clay", "Rocky")
    cities()
    elemNum()
    println(names("Rose", "Musau", "Kivuva"))
}
//1.Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun soil(sl1:String, sl2:String, sl3:String, sl4:String){
    var soil=arrayOf(sl1, sl2, sl3, sl4)
    println(soil.contentToString())
    elemNum()
}

//2. Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun cities(){
    var cities= arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city-> println(city.capitalize()) }
}

//3. Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order (2 points)

fun elemNum(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[1]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    var sortedA=numbers.sortedArray()
    println(sortedA.contentToString())
}

//4. Create a function that takes in 3 names and returns a string array containing
//all 3 names.

fun names(nam1:String, nam2:String, nam3:String):String{
    var alt=arrayOf(nam1,nam2,nam3)
    return alt.contentToString()

}
