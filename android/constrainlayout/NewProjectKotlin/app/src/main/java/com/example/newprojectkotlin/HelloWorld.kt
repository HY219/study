package com.example.newprojectkotlin

// ; 필요x
fun main() {
    //final String hello1 = "hello world"
    val hello1: String = "hello world1" //final = 바꿀 수 없는 값 = 상수

    //String hello2 ="123"
    var hello2: String = "hello world2" //int, string, float, double //null을 넣을 수 없다.

    //String hello3 = null
    var hello3: String? = "hello world3" //null을 넣을 수 있다.

    //hello1 = "123" //불가능 -> hello1은 final
    hello2 = "123"

    hello() //함수 호출해서 사용하기

    print(hello2)
    println(hello1) //자동 줄 바꿈
    println(hello())
}

//private String hello() {}
fun hello(): String {   //void //private void hello() {}
    return "hello world"
}