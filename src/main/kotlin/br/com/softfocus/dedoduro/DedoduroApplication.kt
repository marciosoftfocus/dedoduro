package br.com.softfocus.dedoduro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DedoduroApplication

fun main(args: Array<String>) {
    runApplication<DedoduroApplication>(*args)
}
