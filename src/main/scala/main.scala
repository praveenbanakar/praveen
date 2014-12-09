package com.vogella.first

import pro.savant.circumflex._, core._, web._, freemarker._
import java.util.Date

class Main extends Router {
  val log = new Logger("com.vogella.first")

  'currentDate := new Date

  get("/test") = "I'm fine, thanks!"
  get("/") = ftl("index.ftl")

}