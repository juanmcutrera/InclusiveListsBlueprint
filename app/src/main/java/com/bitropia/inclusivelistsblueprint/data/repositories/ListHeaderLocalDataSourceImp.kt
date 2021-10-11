package com.bitropia.inclusivelistsblueprint.data.repositories


import  com.bitropia.inclusivelistsblueprint.data.db.ListDao
import com.bitropia.inclusivelistsblueprint.data.mappers.ListHeaderEntityMapper
import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject


class ListHeaderLocalDataSourceImp  (
    private val listDao: ListDao,
    private val dispatcher: CoroutineDispatcher,
    private val listheaderEntityMapper: ListHeaderEntityMapper
): ListHeaderLocalDataSource
{

    override suspend fun saveListHeader(header: ListHeader) = withContext(dispatcher) {
        listDao.saveListHeader(listheaderEntityMapper.toListHeaderEntity(header))
    }



}