package com.example.counterapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.counterapp.utils.enums.ScanStatus

@Composable
fun BottomBar(scanStatus: ScanStatus) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(scanStatus.color)
            .height(50.dp)
    ) {
        Text(
            text = scanStatus.message,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}