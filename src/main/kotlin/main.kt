import androidx.compose.desktop.Window
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import common.getCardShape
import modules.attendance.attendanceModule

fun main() = Window {
    MaterialTheme {
        app()
    }
}

@Composable
fun app() {
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
            val scrollState = rememberScrollState(0)
            Row(
                Modifier.weight(1f)
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
                adapter = ScrollbarAdapter(scrollState),
                style = ScrollbarStyle(5.dp, 5.dp, RoundedCornerShape(2.5.dp), 1000, Color.LightGray, Color.DarkGray)
            )
        }
    }
}
