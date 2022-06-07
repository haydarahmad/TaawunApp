package com.haydar.taawun_app.ui.detail

import androidx.lifecycle.MutableLiveData
import com.haydar.taawun_app.data.ResponseDoa
import com.haydar.taawun_app.data.network.ApiClient
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class MainViewModel {
    var isLoading = MutableLiveData<Boolean>()
    var isError = MutableLiveData<Throwable>()
    var doaResponse = MutableLiveData<List<ResponseDoa>>()

    fun getData(responseHandler: (List<ResponseDoa>) -> Unit, errorHandler: (Throwable) -> Unit) {
        ApiClient.getApiService().getDoa()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                responseHandler(it)
            }, {
                errorHandler(it)
            })
    }

    fun getdoa(){
        isLoading.value = true

        getData({
            isLoading.value = false
            doaResponse.value = it//success
        }, {
            isLoading.value = false
            isError.value = it
        })
    }
}