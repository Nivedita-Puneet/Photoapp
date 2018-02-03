package api

import model.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by PUNEETU on 30-01-2018.
 */
interface PhotoAPI {
    @GET("?key=7870371-9b7aff2753595f3c31c82a7ea&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>

}