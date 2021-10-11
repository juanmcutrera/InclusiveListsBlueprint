package com.bitropia.inclusivelistsblueprint.data.repositories
import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import com.bitropia.inclusivelistsblueprint.domain.repositories.ListHeaderRepository


import javax.inject.Inject


class ListHeaderRepositoryImp  @Inject constructor (
    private val listheaderLocalDataSource: ListHeaderLocalDataSource
): ListHeaderRepository {


    override suspend fun saveListHeader(header: ListHeader): Long {
        return listheaderLocalDataSource.saveListHeader(header)
    }


}

