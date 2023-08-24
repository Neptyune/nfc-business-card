import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(){

    // Display cards - horizontal scrollable
    LazyRow (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalAlignment = Alignment.CenterVertically
    ) {
        //add cards
        items (3) {i ->
            Card(
                content = "Card"
            )

        }
    }
}

@Composable
fun Card(
    content: String
) {
    Box(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .padding(10.dp)
            .fillMaxSize()
            .background(Color.LightGray)

    ) {
        Text(content)
    }
}