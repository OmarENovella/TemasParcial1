package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.moviles.R

@Preview(showBackground = true)
@Composable


fun image() {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Red)
    ) {
        Image(
            painter = painterResource(R.drawable.kanye),
            contentDescription = "Jesucristo Pantocrator",
            modifier = Modifier.size(500.dp).clip(CircleShape),
        )
        /*Icon(painter = painterResource(R.drawable.baseline_code),
            contentDescription = null,
            tint = Color.Black
        )
        Icon(imageVector = Icons.Outlined.AddCircle,
            contentDescription = null,
            tint = Color.Black
        )*/
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        Text(
            text = "Padre Nuestro\n" +
                    "que estas en los cielos\n" +
                    "santificado sea tu nombre\n" +
                    "venga a nosotros tu reino\n" +
                    "hagase tu voluntad asi en la tierra como en el cielo\n" +
                    "danos hoy nuestro pan de cada dia\n" +
                    "y perdona nuestras ofensas como tambien\n" +
                    "nosotros perdonamos a los que nos ofenden\n" +
                    "no nos dejes caer en la tentacion y libranos de todo mal\n" +
                    "Amen",
            fontStyle = FontStyle.Italic,
            color = Color.White

        )
    }
}