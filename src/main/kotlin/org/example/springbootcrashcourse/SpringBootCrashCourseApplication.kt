package org.example.springbootcrashcourse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootCrashCourseApplication

fun main(args: Array<String>) {
    runApplication<SpringBootCrashCourseApplication>(*args)
}
