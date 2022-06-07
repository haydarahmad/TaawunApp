package com.haydar.taawun_app.data.network

import com.haydar.taawun_app.data.ResponseDoa
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
   @GET("doa")
   fun getDoa() : Flowable<List<ResponseDoa>>

}