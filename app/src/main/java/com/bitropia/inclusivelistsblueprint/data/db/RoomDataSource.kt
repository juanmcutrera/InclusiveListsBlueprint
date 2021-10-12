package com.bitropia.inclusivelistsblueprint.data.db

import com.bitropia.inclusivelistsblueprint.data.mappers.toRoomListHeader
import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import com.bitropia.inclusivelistsblueprint.data.source.LocalDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class RoomDataSource(db: AppDatabase) : LocalDataSource {
    private val listDao = db.listDao()



    override suspend fun saveListHeader(listHeader: ListHeader): Long =
        withContext(Dispatchers.IO) { listDao.saveListHeader(listHeader.toRoomListHeader()) }
    }
