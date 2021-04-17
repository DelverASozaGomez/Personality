package edu.uca.personality.retrofit

import retrofit2.http.GET

interface PersonalitiesRetrofit {
    @GET("personalities")
    suspend fun get () : List<PersonalitiesEntity>
}