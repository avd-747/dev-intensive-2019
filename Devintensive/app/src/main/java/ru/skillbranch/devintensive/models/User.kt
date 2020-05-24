package ru.skillbranch.devintensive.models

import android.provider.ContactsContract
import java.util.*

class User (
  val id: String,
  var firstName: String?,
  var lastName: String?,
  var avatar: String?,
  var rating: Int = 0,
  var respect: Int = 0,
  val lastVisit: Date? = null,
  val isOnline: Boolean = false
) {
  constructor(id: String, firstName: String?, lastName: String?) : this(
    id = id,
    firstName = firstName,
    lastName = lastName,
    avatar = null
  )

  constructor(id: String) : this(id, firstName = "John", lastName = "Doe $id")

  init {
    println("its live NAME: $firstName $lastName")
  }

  fun printMe() =
    println(
      """
            id: $id
            firstName: $firstName
            lastName: $lastName
            avatar: $avatar
            rating: $rating
            respect: $respect
            lastVisit: $lastVisit
            isOnline: $isOnline
          """.trimIndent()
    )


  companion object  Factory {
    private var lastId:Int=-1

    fun makeUser(fullName:String?):User{
          lastId++
           var parts : List<String>? = fullName?.split(" ")
           var firstName = parts?.getOrNull(index=0)
           var lastName  = parts?.getOrNull(index=1)

      return  User(id="lastId", firstName=firstName, lastName=lastName)

    }

  }

}
