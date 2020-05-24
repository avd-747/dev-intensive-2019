package ru.skillbranch.devintensive.utils

object Utils {
fun partseFullName(fullName:String?):Pair<String?,String?>{
  val parts:List<String>?=fullName?.split(" ")
  val firstName=parts?.getOrNull(0)
  val lastName=parts?.getOrNull(1)
  return firstName to lastName
}



}
