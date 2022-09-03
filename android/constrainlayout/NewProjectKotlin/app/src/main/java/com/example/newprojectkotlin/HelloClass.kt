package com.example.newprojectkotlin

fun main() {

    //유사 기능들(함수)의 집합체(객체)

    //1. class - 자동차(시동, 운전), 사람(밥먹는다, 물마신다, 걷는다), 동물(뛴다), 식물(자란다)
    //2. data class - set, get 을 편리하게 해주는 class

    //1. 코딩
    //2. 호출

    var cls = HelloClass(); //호출 //constructor()와 세트 //HelloClass cls = new HelloClass()
    var cls2 = HelloClass(10); //constructor(age: Int)와 세트

    println(cls2.age)

    var person = Person(5, "Yeon")

    println(person.age)
}

//코딩
class HelloClass {
    var age: Int = 0

    //초기값 //값을 넘길 수 없다.
    //클래스가 어디선가 호출될 때 초기값을 만드는 것
    init {

    }

    //초기값 //값을 넘길 수 있다.
    // default 생성자 : HelloClass가 호출됐을 때, 어떤 값을 초기화할 수 있는 기능 제공
    // 보조 생성자
    constructor() //기본 생성자
    constructor(age: Int) { //보조 생성자 //초기값0age를 받아온(1age)로 덮어씀. //값을 바꾸는 용도 //set
        this.age = age
    }
}

//var: 바뀌는 값, val: 바뀌지 않는 값
data class Person(var age:Int, val name:String)