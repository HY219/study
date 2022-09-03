package com.example.newprojectkotlin

fun main() {
    //map - key, value pair JSON name! senti (value)
    //{"name":"Yeon"} //{"key":"value"{ //Json

    var map1 = mapOf(Pair("name","Yeon")) //수정 불가능
    var map2 = mutableMapOf<String, String>() //type //수정 가능
    map2.put("name","Yeon")
    map2.put("age", "1")

    //keys
    print(map2.keys) //{name, age}

    for(map in map2){
        println(map.value) //Yeon 1
    }

    for(map in map2) {
        println(map)
    }
}