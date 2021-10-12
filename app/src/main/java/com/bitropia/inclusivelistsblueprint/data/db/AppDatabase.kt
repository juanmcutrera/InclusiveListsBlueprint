package com.bitropia.inclusivelistsblueprint.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters



@Database(entities = [ListHeader::class], version = 1, exportSchema = false)

abstract class AppDatabase: RoomDatabase() {

    abstract fun listDao(): ListDao

    companion object {
        @Volatile
        private lateinit var appDatabase: AppDatabase

             fun getDatabase(applicationContext: Context): AppDatabase {
            if (!(::appDatabase.isInitialized)) {
                appDatabase =
                    Room.databaseBuilder(applicationContext,
                        appDatabase::class.java, "InclusiveListsBlueprintDb")
                        .build()
            }
            return appDatabase
        }

    }

}