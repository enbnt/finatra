package com.posterous.finatra

object Whatever extends FinatraApp {
  get("/lol") { <h1>lol</h1> }
}


object SomeShit extends FinatraApp {

  get("/") { <h1>asd</h1> } 

  get("/foo") { <h1>foo</h1> }
  
  get("/simple") { params("foo") }
  
  get("/doit/:year") { params("name") }

}

