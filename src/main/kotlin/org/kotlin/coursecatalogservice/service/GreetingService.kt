package org.kotlin.coursecatalogservice.service

import org.springframework.stereotype.Service

@Service
class GreetingService {

    fun retrieveGreeting(name: String) : String = "Hello, $name"
}