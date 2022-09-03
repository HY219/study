package com.example.newprojectkotlin

fun main() {
    //1. 배열
    //2. loop 반복
    //3. 캐스팅 (가볍게)

    //1. 배열 = {"","",""}
    var arr1 = listOf("1","2") //list 수정 불가능
    var arr2 = mutableListOf("1","2") //list 수정 가능

    //arr1.add("3") -> 불가능
    arr2.add("3")

    //2. 반복문 (향상된 반복문)
    //for(int i = 0; i>5 ;i++;) {}
    //arr1에 있는 인자를 하나씩 꺼내온다.
    for(item in arr1){
        println(item)
    }

    //몇번째 인자인지
    for((index, item) in arr1.withIndex()){
        //println(index + "," + item)
        println("$index, $item")
        arr2.remove("1") //삭제
        arr2.removeAt(0) //0번째 삭제
    }

    //3. casting object < String, int, long... //모든 객체를 담을 수 있는 최상위 객체 //Any - auto casting
    var hello: Any = "hello" //타입:Any, 초기값:hello
    if(hello is String){ //hello가 String이면(true면)
        //(String) hello;
        hello; //자동 형변환 //casting //타입 찾아가기 //안적어도됨.
        //hello.length;
        var str: String = hello //형변환없이 바로 담기 가능
    }
}