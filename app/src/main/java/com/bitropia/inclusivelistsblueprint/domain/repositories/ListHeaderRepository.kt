package com.bitropia.inclusivelistsblueprint.domain.repositories

import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import kotlinx.coroutines.flow.Flow

interface ListHeaderRepository {

    suspend fun saveListHeader(header: ListHeader): Long

}