package com.malikali.basicstatecodelab.models

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class WellnessTask(val id: Int, val label: String,initialChecked: Boolean = false
 ) {
     var checked by mutableStateOf(initialChecked)
 }
/*
can also be done like this
data class WellnessTask(val id: Int, val label: String, val checked: MutableState<Boolean> = mutableStateOf(false))


 */