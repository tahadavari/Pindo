import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.pindo.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreenTopBar() {
    CenterAlignedTopAppBar(
        title = { Text(text = "Category") },
        navigationIcon = {
            IconButton(onClick = { /* Handle category selection */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_down),
                    contentDescription = "Category"
                )
            }
        },
        actions = {
            IconButton(onClick = { /* Handle filter action */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search_and_sort),
                    contentDescription = "Filter"
                )
            }
        }
    )
}