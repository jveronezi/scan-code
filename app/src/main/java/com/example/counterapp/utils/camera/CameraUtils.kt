package com.example.counterapp.utils.camera

import android.content.Context
import androidx.camera.lifecycle.ProcessCameraProvider
import java.util.concurrent.Executors

object CameraUtils {

    /**
     * Check if the camera is accessible
     * @param context Context of the calling activity or application
     * @param onResult Callback to return whether the camera is accessible
     */
    fun isCameraAccessible(context: Context, onResult: (Boolean) -> Unit) {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(context)
        val executor = Executors.newSingleThreadExecutor()

        cameraProviderFuture.addListener({
            try {
                val cameraProvider = cameraProviderFuture.get()
                onResult(cameraProvider != null)
            } catch (e: Exception) {
                e.printStackTrace()
                onResult(false)
            }
        }, executor)
    }
}
