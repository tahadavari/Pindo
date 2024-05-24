import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.pindo.ui.Header
import com.example.pindo.ui.RunningOutSection
import com.example.pindo.ui.TopOfferSection

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(26.dp)
    ) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        RunningOutSection(navController)
        Spacer(modifier = Modifier.height(16.dp))
        TopOfferSection()
    }
}