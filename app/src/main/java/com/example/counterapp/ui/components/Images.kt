package com.example.counterapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.counterapp.R

@Composable
fun CheckMark(modifier: Modifier = Modifier) {
    val checkMarkIcon = painterResource(R.drawable.check)
    Image (
        painter = checkMarkIcon,
        contentDescription = null
    )
}

@Composable
fun XMark(modifier: Modifier = Modifier) {
    val icon = painterResource(R.drawable.xmark)
    Image (
        painter = icon,
        contentDescription = null
    )
}

@Composable
fun Barcode(modifier: Modifier = Modifier) {
    val icon = painterResource(R.drawable.barcode)
    Image (
        painter = icon,
        contentDescription = null
    )
}

