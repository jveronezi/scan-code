package com.example.counterapp.utils.camera

import android.Manifest
import android.content.Context
import androidx.activity.result.ActivityResultLauncher
import androidx.core.content.ContextCompat

object CameraPermissionManager {

    /**
     * Request camera permission
     * @param launcher ActivityResultLauncher for requesting permissions
     */
    fun requestCameraPermission(launcher: ActivityResultLauncher<String>) {
        launcher.launch(Manifest.permission.CAMERA)
    }

    /**
     * Check if camera permission is granted
     * @param context Context to check permission
     * @return true if permission is granted, false otherwise
     */
    fun isPermissionGranted(context: Context): Boolean {
        return ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) ==
                android.content.pm.PackageManager.PERMISSION_GRANTED
    }
}