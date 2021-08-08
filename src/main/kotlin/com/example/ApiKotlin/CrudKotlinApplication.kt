package com.example.ApiKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.example")
class CrudKotlinApplication

fun main(args: Array<String>) {
    runApplication<CrudKotlinApplication>(*args)

}