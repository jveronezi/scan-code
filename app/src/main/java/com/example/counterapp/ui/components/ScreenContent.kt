package com.example.counterapp.ui.components

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.example.counterapp.utils.enums.ScanStatus
import kotlinx.coroutines.launch

@Composable
fun ScreenContent(internetStatus: Boolean, scanStatus: ScanStatus) {
    val internetStatusSubTitle = if (internetStatus) "Online" else "Offline"
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()

    fun openDrawer() {
        coroutineScope.launch() {
            drawerState.open()
        }
    }

    Drawer(drawerState) {
        Scaffold(
            topBar = { TopBar(scanStatus, internetStatusSubTitle, ::openDrawer) },
            bottomBar = { BottomBar(scanStatus) }
        ) { paddingValues ->
            ScanStatusContainer(paddingValues, scanStatus)
        }
    }
}
