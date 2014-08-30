package com.trunktrunk.servlets

import com.trunktrunk.TrunktrunkStack
import com.trunktrunk.models.Post

/**
 * Created by mikkellarsen on 8/30/14.
 */
class PostServlet extends TrunktrunkStack {

  get("/") {
    val post = new Post("Post title", "Post text")
    post
  }

}
