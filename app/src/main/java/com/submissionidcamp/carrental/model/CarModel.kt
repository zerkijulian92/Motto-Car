package com.submissionidcamp.carrental.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CarModel (
    var id: String ?="",
    var tipe: String ?="",
    var merek: String ?="",
    var desc: String ?="",
    var price_per_day: String ?="",
    var thumbnail_potrait: Int ?=0,
    var thumbnail_landscape: Int ?=0,
    var rating: Float
): Parcelable