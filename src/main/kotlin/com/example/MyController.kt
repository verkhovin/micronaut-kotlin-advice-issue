package com.example

import io.micronaut.http.annotation.Get
import com.example.MyAround
import io.micronaut.http.annotation.Controller

@Controller
open class MyController {
  @Get("/")
  @MyAround
  open fun get() {
    print("Hello")
  }
}
