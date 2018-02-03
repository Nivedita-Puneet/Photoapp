package model

import java.io.Serializable

/**
 * Created by PUNEETU on 30-01-2018.
 */
data class Photo(val id: String,
                 val likes: Int,
                 val favourites:Int,
                 val tags: String,
                 val previewUrl: String,
                 val webformatUrl: String) : Serializable {
}