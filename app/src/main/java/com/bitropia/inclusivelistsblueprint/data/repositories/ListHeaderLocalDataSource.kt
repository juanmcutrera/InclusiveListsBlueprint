package com.bitropia.inclusivelistsblueprint.data.repositories

import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import kotlinx.coroutines.flow.Flow

interface ListHeaderLocalDataSource {
    suspend fun saveListHeader(header: ListHeader): Long

}