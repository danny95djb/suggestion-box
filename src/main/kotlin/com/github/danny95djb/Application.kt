package com.github.danny95djb

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.danny95djb")
		.start()
}

