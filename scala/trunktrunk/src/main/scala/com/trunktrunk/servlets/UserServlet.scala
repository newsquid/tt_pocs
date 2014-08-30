package com.trunktrunk.servlets

import com.trunktrunk.TrunktrunkStack
import com.trunktrunk.models.User


/**
 * Created by mikkellarsen on 8/30/14.
 */
class UserServlet extends TrunktrunkStack {

  get("/") {
    val user = new User("User Name")
    user
  }

}
