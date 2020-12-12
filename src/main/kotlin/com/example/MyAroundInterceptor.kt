package com.example

import io.micronaut.aop.MethodInterceptor
import io.micronaut.aop.MethodInvocationContext
import javax.inject.Singleton

@Singleton
class MyAroundInterceptor : MethodInterceptor<Any, Any> {
  override fun intercept(context: MethodInvocationContext<Any, Any>): Any {
    return context.proceed()
  }
}
