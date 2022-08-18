package com.example.submissionkeduabaru.main.api

import com.example.submissionkeduabaru.main.model.DetailUserResponse
import com.example.submissionkeduabaru.main.model.User
import com.example.submissionkeduabaru.main.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUser(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>


}