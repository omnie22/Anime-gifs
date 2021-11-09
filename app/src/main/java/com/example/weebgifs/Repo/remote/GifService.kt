package com.example.weebgifs.Repo.remote

import model.GifList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GifService {
//    MY SPAGHETTI IS UNSTOPPABLE
    @GET("/api/v1/bite")
    suspend fun getBite(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/baka")
    suspend fun getBaka(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/blush")
    suspend fun getBlush(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/bored")
    suspend fun getBored(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/cry")
    suspend fun getCry(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/cuddle")
    suspend fun getCuddle(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/dance")
    suspend fun getDance(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/facepalm")
    suspend fun getFacepalm(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/feed")
    suspend fun getFeed(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/happy")
    suspend fun getHappy(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/highfive")
    suspend fun getHighfive(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/hug")
    suspend fun getHug(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/kiss")
    suspend fun getKiss(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/laugh")
    suspend fun getLaugh(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/pat")
    suspend fun getPat(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/poke")
    suspend fun getPoke(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/pout")
    suspend fun getPout(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/shrug")
    suspend fun getShrug(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/slap")
    suspend fun getSlap(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/sleep")
    suspend fun getSleep(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/smile")
    suspend fun getSmile(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/smug")
    suspend fun getSmug(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/stare")
    suspend fun getStare(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/think")
    suspend fun getThink(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/thumbsup")
    suspend fun getThumbsup(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/tickle")
    suspend fun getTickle(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/wave")
    suspend fun getWave(
        @Query("amount") amount: Int
    ): Response<GifList>
    @GET("/api/v1/wink")
    suspend fun getWink(
        @Query("amount") amount: Int
    ): Response<GifList>
}