import androidx.compose.desktop.Window
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

fun main() = Window {
    MaterialTheme {
        app()
    }
}

@Composable
fun app() {
    var scrollState = rememberScrollState(0)
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Pets Show")
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Btn")
                    }
                },
                backgroundColor = Color.Transparent,
                contentColor = Color.Gray,
                elevation = 0.dp
            )
        }
    ) {
        Column {
            Row(
                Modifier
                    .weight(1f)
                    .horizontalScroll(scrollState)
            ) {
                Card(getCardShape(), elevation = 10.dp, shape = RoundedCornerShape(10.dp)) {
                    attendanceModule()
                }
                Card(getCardShape(), elevation = 10.dp, shape = RoundedCornerShape(10.dp)) {

                }
                Card(getCardShape(), elevation = 10.dp, shape = RoundedCornerShape(10.dp)) {

                }
            }
            HorizontalScrollbar(
                adapter = ScrollbarAdapter(scrollState)
            )
        }
    }
}

@Composable
fun attendanceModule() {
    val todaysAttendanceList = remember { listOf(Attendance("123123"), Attendance("12312323")) }
    Column (Modifier
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

fun getCardShape(): Modifier = Modifier
    .fillMaxHeight()
    .width(300.dp)
    .padding(20.dp)
