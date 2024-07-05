package crud.example.com.ui.view

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import crud.example.com.ui.components.TabBar
import crud.example.com.ui.theme.CRUDTheme

@Composable
fun EditView(navController: NavController) {
    CRUDTheme {
        Scaffold(
            topBar = { },
            bottomBar = { TabBar(navController = navController, screen = 2) }
        ) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {
  println("home2")
            }
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "Default Preview Dark"
)
@Composable
fun PreviewEdit(){
    val navController = rememberNavController()
    EditView(navController)
}