package me.seokang.commerce.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.seokang.commerce.designsystem.R.drawable
import me.seokang.commerce.designsystem.SeokangcommerceappTheme


@Composable
fun MainTopScreen() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 16.dp, end = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(vertical = 12.dp)
        ) {
            Image(painter = painterResource(id = drawable.ic_menu), contentDescription = "MainTopMenu")
        }

        Image(
            painter = painterResource(id = drawable.ic_logo_small), contentDescription = "MainTopLogo",
            modifier = Modifier.padding(vertical = 12.dp)
        )

        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Image(painter = painterResource(id = drawable.ic_profile), contentDescription = "MainTopProfile")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainTopScreenPreview() {
    SeokangcommerceappTheme {
        MainTopScreen()
    }
}