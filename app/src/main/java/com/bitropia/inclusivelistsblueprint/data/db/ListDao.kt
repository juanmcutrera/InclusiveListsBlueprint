package com.bitropia.inclusivelistsblueprint.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.bitropia.inclusivelistsblueprint.data.entities.ListHeaderEntity


@Dao
public interface ListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveListHeader(listheader: ListHeaderEntity): Long

}