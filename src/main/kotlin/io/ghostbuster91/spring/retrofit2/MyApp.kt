package io.ghostbuster91.spring.retrofit2

import io.ghostbuster91.spring.boot.retrofit2.EnableAutoRetrofit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@SpringBootApplication
@EnableAutoRetrofit
class MyApp {

    @Bean
    fun retrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
    }
}

fun main(args: Array<String>) {
    runApplication<MyApp>()
}