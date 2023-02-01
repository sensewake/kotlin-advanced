class `7_LateInit`{
    lateinit var text:String

    val textInitialized : Boolean
        get() = this::text.isInitialized

//    fun printText(){
//        println(text)
//    }

    fun printText(){
        text = "안녕하세요"
        if(this::text.isInitialized){
            /*
            * isInitialized 이런 프로퍼티는 함수 외부 즉 mian함수에선 바로 호출 할 수 없다.
            * 그래서
            * val textInitialized : Boolean
            * get() = this::text.isInitialized
            * 이렇게 get함수를 선언하면 text.isInitialized로 접근할 수 있다.
            * */
            println("초기화됨")
        } else {

        }
        println(text)
    }
}

fun a (str:String, block:(String)->Unit){
    block(str)
}

/*fun main(){
    val test = `7_LateInit`()
    test.printText()
}*/


fun main(){
    "".let{ }
    a(""){
        it.length
        println(it)
        println(it.length)
    }
    val test = `7_LateInit`()

    if(!test.textInitialized){
        test.text = "하이요"
    }
    test.printText()
    println(test.textInitialized)
}
