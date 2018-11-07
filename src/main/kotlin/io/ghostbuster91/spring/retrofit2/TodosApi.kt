package io.ghostbuster91.spring.retrofit2

import io.ghostbuster91.spring.boot.retrofit2.AutoRetrofit
import io.reactivex.Observable
import retrofit2.http.GET

@AutoRetrofit
interface TodosApi {

    @GET("/todos/1")
    fun getTodo() : Observable<Todo>
}