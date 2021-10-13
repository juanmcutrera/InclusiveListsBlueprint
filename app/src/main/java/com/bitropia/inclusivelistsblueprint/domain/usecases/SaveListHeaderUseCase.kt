package com.bitropia.inclusivelistsblueprint.domain.usecases
import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader


import com.bitropia.inclusivelistsblueprint.data.repositories.ListHeaderRepository
import javax.inject.Inject

class SaveListHeaderUseCase  @Inject constructor(
    private val listheaderRepository: ListHeaderRepository)
{

    suspend operator fun invoke(header: ListHeader) = listheaderRepository.saveListHeader(header)
}

