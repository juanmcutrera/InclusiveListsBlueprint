package com.bitropia.inclusivelistsblueprint.data.source

import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader

interface LocalDataSource {

    suspend fun saveListHeader(header: ListHeader): Long

}