package com.example.counterapp.ui.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.counterapp.utils.enums.ScanStatus

@Composable
fun ScanStatusContainer(paddingValues: PaddingValues, scanStatus: ScanStatus) {
    Box(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .background(scanStatus.color),
        contentAlignment = Alignment.Center
    ) {
        scanStatus.icon(Modifier)
    }
}