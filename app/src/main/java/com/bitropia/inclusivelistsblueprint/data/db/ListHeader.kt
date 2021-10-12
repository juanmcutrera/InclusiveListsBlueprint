package com.bitropia.inclusivelistsblueprint.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ListHeader(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val description: String

)
