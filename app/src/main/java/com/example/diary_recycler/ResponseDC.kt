package com.example.diary_recycler

import retrofit2.Call
import retrofit2.http.*


data class ResponseDC(var result:String? = null)

interface APIInterface {
    @GET("/")
    fun getRequest(@Query("name") name: String): Call<ResponseDC>

    @FormUrlEncoded
    @POST("/")
    fun postRequest(@Field("id")id: String,
                    @Field("password")password: String):Call<ResponseDC>

    @FormUrlEncoded
    @PUT("/{id}")
    fun putRequest(@Path("id")id: String,
                   @Field("content")content: String): Call<ResponseDC>

    @DELETE("/{id}")
    fun deleteRequest(@Path("id")id: String): Call<ResponseDC>


    @FormUrlEncoded
    @POST("/signup")
    fun postSignUp(@FieldMap param: HashMap<String?, Any?>?): Call<SignUp>

}