package com.bitropia.inclusivelistsblueprint.ui.viewmodels
import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.*
import com.bitropia.inclusivelistsblueprint.domain.usecases.SaveListHeaderUseCase
import com.bitropia.inclusivelistsblueprint.ui.common.ScopedViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ListHeaderViewModel @Inject constructor(private val saveListHeader: SaveListHeaderUseCase) : ScopedViewModel()
{
    private val coroutineScope = CoroutineScope(Dispatchers.Main)


    init {

        initScope()


    }

    fun saveListHeader(header: ListHeader) {

        coroutineScope.launch(Dispatchers.IO) {
            saveListHeader.invoke(header)

        }
    }


}