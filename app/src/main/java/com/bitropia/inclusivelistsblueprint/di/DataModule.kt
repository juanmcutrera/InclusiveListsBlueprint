package com.bitropia.inclusivelistsblueprint.di

import com.bitropia.inclusivelistsblueprint.data.repositories.ListHeaderRepository
import com.bitropia.inclusivelistsblueprint.data.source.LocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataModule {


    @Provides
    fun listheaderRepositoryProvider(
        localDataSource: LocalDataSource,

    ) = ListHeaderRepository(localDataSource)
}