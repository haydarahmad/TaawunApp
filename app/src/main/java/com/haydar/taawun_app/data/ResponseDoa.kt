package com.haydar.taawun_app.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseDoa(

	@field:SerializedName("ayat")
	val ayat: String? = null,

	@field:SerializedName("doa")
	val doa: String? = null,

	@field:SerializedName("artinya")
	val artinya: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("latin")
	val latin: String? = null
) : Parcelable
