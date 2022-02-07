package com.bitropia.inclusivelistsblueprint.ui.main
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

import com.bitropia.inclusivelistsblueprint.data.repositories.ListHeaderRepository
import com.bitropia.inclusivelistsblueprint.domain.usecases.SaveListHeaderUseCase

@Module
@InstallIn(ViewModelComponent::class)
class MainActivityModule {

    @Provides
    @ViewModelScoped
    fun getListHeaderProvider(listheaderRepository: ListHeaderRepository) =
        SaveListHeaderUseCase(listheaderRepository)

}