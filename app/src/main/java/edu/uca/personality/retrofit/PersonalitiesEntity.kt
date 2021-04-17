package edu.uca.personality.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PersonalitiesEntity (
    @SerializedName("id")
    @Expose
    var id: Int,

    @SerializedName("name")
    @Expose
    var name: String,

    @SerializedName("description")
    @Expose
    var description: String,

    @SerializedName("url")
    @Expose
    var url: String,
)