package com.example.counterapp.utils.enums

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.counterapp.ui.components.Barcode
import com.example.counterapp.ui.components.CheckMark
import com.example.counterapp.ui.components.XMark

enum class ScanStatus(val message: String, val color: Color, val icon: @Composable (Modifier) -> Unit) {
    IDLE("Ready to Scan", Color.LightGray, { Barcode(it) }),
    SUCCESS("Valid Ticket", Color(0xFF91EE8F), { CheckMark(it) }),
    ERROR("Invalid Ticket", Color(0xFFF34949), { XMark(it) })
}
