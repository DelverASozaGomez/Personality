package edu.uca.personality.utils

import edu.uca.personality.model.Personalities
import java.lang.Exception

sealed class DataState {
    object Idle:DataState()
    data class Success(val personalities:List<Personalities>) : DataState()
    data class Error(val exception: Exception) : DataState()
    object Loading: DataState()

}