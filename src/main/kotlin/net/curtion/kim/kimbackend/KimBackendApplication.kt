package net.curtion.kim.kimbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KimBackendApplication

fun main(args: Array<String>) {
	runApplication<KimBackendApplication>(*args)
}
