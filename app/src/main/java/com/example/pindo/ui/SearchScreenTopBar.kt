import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pindo.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreenTopBar() {
    TopAppBar(
        title = {
            RowWithIcon(
                text = "Category",
                iconRes = R.drawable.ic_home,
                iconContentDescription = "Category Icon",
                spacing = 8.dp
            )
        },
        actions = {
            IconButton(onClick = { /* Handle filter action */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "Filter"
                )
            }
        }
    )
}

@Composable
fun RowWithIcon(
    text: String,
    iconRes: Int,
    iconContentDescription: String,
    spacing: Dp,
    modifier: Modifier = Modifier
) {
    Layout(
        content = {
            Text(text = text)
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = iconContentDescription
            )
        },
        modifier = modifier
    ) { measurables, constraints ->
        val textPlaceable = measurables[0].measure(constraints)
        val iconPlaceable = measurables[1].measure(constraints)

        val width = textPlaceable.width + spacing.roundToPx() + iconPlaceable.width
        val height = maxOf(textPlaceable.height, iconPlaceable.height)

        layout(width, height) {
            val textY = (height - textPlaceable.height) / 2
            val iconY = (height - iconPlaceable.height) / 2

            textPlaceable.placeRelative(0, textY)
            iconPlaceable.placeRelative(textPlaceable.width + spacing.roundToPx(), iconY)
        }
    }
}
