package com.example.compose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme
import kotlin.math.exp

private val mensajes: List<MainActivity.Mensaje> = listOf(
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
    MainActivity.Mensaje(
        "labore et dolore magna aliqua.",
        "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga"
    ),
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme() {
                //component()
                misMensajes(mensajes)
            }
        }
    }

    @Composable
    fun misTextos(mensaje: Mensaje) {
        var expanded by remember { mutableStateOf(false) }
        MaterialTheme() {
            Column(modifier = Modifier
                .padding(top = 1.dp)
                .clickable {
                    expanded = !expanded
                }) {
                personalData(
                    mensaje.title,
                    MaterialTheme.colors.primary,
                    MaterialTheme.typography.subtitle1
                )
                personalData(
                    mensaje.body,
                    MaterialTheme.colors.onBackground,
                    MaterialTheme.typography.subtitle2,
                    if (expanded) Int.MAX_VALUE else 1
                )
            }
        }
    }

    @Composable
    fun personalData(
        name: String,
        color: Color,
        style: androidx.compose.ui.text.TextStyle,
        lines: Int = Int.MAX_VALUE
    ) {
        Text(name, color = color, style = style, maxLines = lines)
    }

    @Composable
    fun imagen() {
        MaterialTheme() {
            Image(
                painter = painterResource(id = R.drawable.tara1),
                contentDescription = "Tara",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(64.dp)
            )
        }
    }

    data class Mensaje(val title: String, val body: String)

    @Composable
    fun misMensajes(mensajes: List<Mensaje>) {
        LazyColumn {
            items(mensajes) { mensaje ->
                component(mensaje)
            }
        }
    }

    @Composable
    fun component(mensaje: Mensaje) {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colors.background)
                .padding(start = 4.dp, top = 1.dp)
        ) {
            misTextos(mensaje)
            Spacer(modifier = Modifier.height(60.dp))
            imagen()
        }
    }

    //showSystemUi = true ver en el movil
    @Preview()
    @Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun previewComponent() {
        ComposeTheme {
            //val scroll = rememberScrollState();
            // Column(modifier = Modifier.verticalScroll(scroll)) {
            misMensajes(mensajes)
            //}
        }
    }
}


