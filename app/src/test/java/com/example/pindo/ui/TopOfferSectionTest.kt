import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.testing.TestNavHostController
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.pindo.ui.TopOfferSection
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TopOfferSectionTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private lateinit var navController: TestNavHostController

    @Before
    fun setup() {
        navController = TestNavHostController(InstrumentationRegistry.getInstrumentation().targetContext)
        composeTestRule.setContent {
            TopOfferSection(navController)
        }
    }

    @Test
    fun topOfferSection_displaysCorrectNumberOfItems() {
        composeTestRule.onNodeWithText("Product 02").assertExists()
        composeTestRule.onNodeWithText("Product 03").assertExists()
        composeTestRule.onNodeWithText("Product 04").assertExists()
        composeTestRule.onNodeWithText("Product 05").assertExists()
        composeTestRule.onNodeWithText("Product 06").assertExists()
        composeTestRule.onNodeWithText("Product 07").assertExists()
        composeTestRule.onNodeWithText("Product 08").assertExists()
        composeTestRule.onNodeWithText("Product 09").assertExists()
        composeTestRule.onNodeWithText("Product 10").assertExists()
        composeTestRule.onNodeWithText("Product 11").assertExists()
        composeTestRule.onNodeWithText("Product 12").assertExists()
    }
}