package io.ghostbuster91.spring.retrofit2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyRestController(private val todosApi: TodosApi) {

    @GetMapping
    fun getSth(): Todo? {
        return todosApi.getTodo().blockingFirst()
    }
}

data class Todo(val userId:String, val title:String)