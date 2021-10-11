package com.bitropia.inclusivelistsblueprint.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "listheader")
data class ListHeaderEntity(
    @PrimaryKey
    val Id: Int,
    val Description: String,
    val Price: Float,
    val Quantity: Float,
    val IdDesc: String

)
