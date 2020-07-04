package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class ModelData(

    @SerializedName("status")
    var status: String,
    @SerializedName("totalResults")
    var totalResults: String)