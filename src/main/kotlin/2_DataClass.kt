data class Person(val name: String, val age:Int)

fun main(){
    val person1 = Person(name="tony", age=12)
    println(person1.toString())
    println("===============================")
    //val (name, age) = person1
    //println("이름=${name}, 나이=${age}")
    //println("===============================hashSetOf")
    val set = hashSetOf(person1) //setOf면 정상 동작
    println(set.contains(person1))
    //println("===============================")
//    person1.name = "strange"
//    println(set.contains(person1))

    println("===============================copy")
    val person2 = person1.copy(name="strange")
    println(person2.toString())

    println("===============================componetN 프로퍼티를 순서대로 가져온다.")
    println("이름=${person1.component1()}, 나이=${person1.component2()}")

    println("===============================구조분해할당으로 안전하게 변수 선언")
    val (name, age) = person1
    println("이름=${name}, 나이=${age}")

}