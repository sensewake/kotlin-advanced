import java.util.*
import java.util.stream.Collectors
import kotlin.collections.ArrayList

fun main(){
    //immutable
    val currencyList = listOf("달러","유로","원")

    //mutable
    val mutableCurrencyList:MutableList<String> = mutableListOf<String>().apply{
        add("달러")
        add("유로")
        add("원")
    }

    mutableCurrencyList.add("파운드")

    //immutable set
    val numberSet = setOf(1,2,3,4)

    //mutable set
    val mutableSet = mutableSetOf<Int>().apply{
        add(1)
        add(2)
        add(3)
        add(4)
    }

    //immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    //mutable map 리터럴문법 추천 .put을 생략해서 사용
    //mutableNumberMap.put("three",3)
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3

    //컬렉션 빌더는 내부에선 mutable 반환은 immutable
    val numberList: List<Int> = buildList{
        add(1)
        add(2)
        add(3)
        add(4)
    }

    //linkedList : 특정구현제의 생성자를 사용
    val linkedList = LinkedList<Int>().apply{
        addFirst(3)
        add(2)
        addLast(1)
    }

    //arrayList
    val arrayList = ArrayList<Int>().apply{
        add(1)
        add(2)
        add(3)
    }

    //코틀린의 컬렉션은 Iterable 의 구현체이므로 순차적 반복이 가능하다
    val iterator = currencyList.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }

    println("==============================for in ")

    for(currency in currencyList){
        println(currency)
    }

    println("==============================forEach")

    currencyList.forEach{
        println(it)
    }

    println("==============================for loop -> map")
    val lowerList = listOf("a","b","c")
    val upperList1 = mutableListOf<String>()

    for(lowerCase in lowerList){
        upperList1.add(lowerCase.uppercase())
    }

    val upperList2 = lowerList.map{it.uppercase()}
    val filteredList1 = mutableListOf<String>()
    for(upperCase in upperList2){
        if(upperCase == "A" || upperCase == "C"){
            filteredList1.add(upperCase)
        }
    }
    println(filteredList1)

    val filteredList2 = upperList2
        .asSequence()
        .filter{it=="A"||it=="C"}
        .toList()

    println(filteredList2)


}