import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pindo.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Product 01") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back navigation */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = "Back"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* Handle more actions */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = "More"
                        )
                    }
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(Color.Gray)
                ) {
                    // Add Image here
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Product 01",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Seller")
                    Spacer(modifier = Modifier.width(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.placeholder_image),
                        contentDescription = "Seller Profile",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Asghar Agha")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row {
                    Text(
                        text = "20$",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "37$",
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "End in")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "04h : 51m : 22s")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Description",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Maxime mollitia, molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum numquam blanditiis harum quisquam eius sed odit."
                )
            }
        }
    )
}