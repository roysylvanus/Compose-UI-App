package com.malikali.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


//@Composable
//fun WaterCounter(modifier:Modifier = Modifier){
//    var count by rememberSaveable { mutableStateOf(0) }
//    /*
//
//    Can also be written like this
//    val count: MutableState<Int> = remember { mutableStateOf(0) }
//
//    to change or derive count should be written like this count.value
//     */
//
//    Column(modifier=modifier.padding(16.dp)) {
//        var showTask by rememberSaveable {
//            mutableStateOf(false)
//        }
//        if (count>0)
//        {
//
//            if (showTask){
//                WellnessTaskItem( onClose = {
//
//                    showTask = false
//                                            },
//                    taskName = stringResource(id = R.string.task_q))
//            }
//            Text(
//                text = stringResource(R.string.water_count, count),
//                modifier = modifier.padding(16.dp)
//            )
//
//
//        }
//       Row(modifier.padding(8.dp)) {
//           Button(onClick = { count++
//               showTask = true
//                            },
//               modifier.padding(top = 8.dp), enabled = count < 10) {
//               Text(text = stringResource(id = R.string.add_count))
//           }
//           Button(onClick = { count = 0 }, Modifier.padding(8.dp)) {
//               Text(text = stringResource(id = R.string.clear_count))
//           }
//       }
//
//    }
//
//
//
//
//}

@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    }
}

@Composable
fun StatefulCounter() {
    var waterCount by remember { mutableStateOf(0) }

    StatelessCounter(waterCount, { waterCount++ })

}