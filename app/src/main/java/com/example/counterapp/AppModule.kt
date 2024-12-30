package com.example.counterapp

import com.example.counterapp.utils.ScanCode
import com.example.counterapp.utils.camera.CameraController
import com.example.counterapp.utils.camera.CameraManager
import com.example.counterapp.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideScanCode(): ScanCode {
        return ScanCode() // Replace with appropriate constructor or initialization logic
    }

    @Provides
    fun provideCameraManager(scanCode: ScanCode): CameraManager {
        return CameraManager(scanCode)
    }

    @Provides
    fun provideCameraController(
        cameraManager: CameraManager,
        mainViewModel: MainViewModel
    ): CameraController {
        return CameraController(cameraManager, mainViewModel)
    }
}
