package dev.himanshu.myapplication.ui

import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState
import com.rickclephas.kmp.observableviewmodel.MutableStateFlow
import com.rickclephas.kmp.observableviewmodel.ViewModel
import com.rickclephas.kmp.observableviewmodel.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.StateFlow

class SharedTestViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(viewModelScope, "")

    @NativeCoroutinesState
    val uiState: StateFlow<String> = _uiState

    init {
        timer()
    }

    fun timer() = viewModelScope.launch {
        repeat(20) {
            delay(1000)
            _uiState.value = it.toString()
        }
    }


}