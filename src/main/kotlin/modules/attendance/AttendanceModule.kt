package modules.attendance

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import modules.attendance.model.Attendance

@Composable
fun attendanceModule() {
    val todaysAttendanceList = remember { listOf(Attendance("123123"), Attendance("12312323")) }
    Column (
        Modifier
        .fillMaxSize()
        .background(Color(0.9f, 0.9f, 1f))
        .padding(10.dp)) {
        for (attendee in todaysAttendanceList) {
            Text(text = attendee.name,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(10.dp))
            Divider(thickness = 0.5.dp)
        }
    }
}
