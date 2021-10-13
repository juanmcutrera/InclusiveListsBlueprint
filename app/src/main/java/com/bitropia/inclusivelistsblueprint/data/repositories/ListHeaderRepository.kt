package com.bitropia.inclusivelistsblueprint.data.repositories
import com.bitropia.inclusivelistsblueprint.data.source.LocalDataSource
import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader


class ListHeaderRepository(private val localDataSource: LocalDataSource)
{

    suspend fun saveListHeader(header: ListHeader) = localDataSource.saveListHeader(header)


}