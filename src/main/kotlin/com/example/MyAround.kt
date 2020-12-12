package com.example

import io.micronaut.aop.Around
import com.example.MyAroundInterceptor
import io.micronaut.context.annotation.Type
import io.micronaut.core.annotation.Internal
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Around
@Internal
@Type(MyAroundInterceptor::class)
@Target(AnnotationTarget.FUNCTION)
annotation class MyAround
