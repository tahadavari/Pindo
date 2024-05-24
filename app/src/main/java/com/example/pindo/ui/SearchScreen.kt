import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.pindo.ui.BottomNavBar
import com.example.pindo.ui.ProductCard


@Composable
fun SearchScreen(navController: NavHostController) {
    Scaffold(
        topBar = { SearchScreenTopBar() },
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SearchBar()
            LazyColumn(
                modifier = Modifier
                    .width(327.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(10) {
                    ProductCard(productName = "test", navController)
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}