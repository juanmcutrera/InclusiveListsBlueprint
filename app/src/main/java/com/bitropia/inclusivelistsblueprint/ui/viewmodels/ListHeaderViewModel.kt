package com.bitropia.inclusivelistsblueprint.ui.viewmodels

import com.bitropia.inclusivelistsblueprint.domain.usecases.SaveListHeaderUseCase
import com.bitropia.inclusivelistsblueprint.ui.common.ScopedViewModel
import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class ListHeaderViewModel
@Inject constructor(private val savelistheaderUseCase: SaveListHeaderUseCase) :  ScopedViewModel()  {


    private fun save(listheader: ListHeader) {
        viewModelScope.launch {
            savelistheaderUseCase.invoke(listheader)
        }
    }
}