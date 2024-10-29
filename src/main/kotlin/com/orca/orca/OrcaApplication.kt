package com.orca.orca

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrcaApplication

fun main(args: Array<String>) {
	runApplication<OrcaApplication>(*args)
}
