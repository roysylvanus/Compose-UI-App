package com.malikali.basicstatecodelab.data

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.malikali.basicstatecodelab.WellnessTaskItem
import com.malikali.basicstatecodelab.models.WellnessTask



@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> ,
    onCheckedTask: (WellnessTask,Boolean)->Unit,
    onCloseTask: (WellnessTask) -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items = list,
            key = {task -> task.id})
        {

                task ->
            WellnessTaskItem(taskName = task.label,
                checked = task.checked,
                onCheckedChange = { checked -> onCheckedTask(task, checked) },
                onClose = { onCloseTask(task) })
        }
    }
}