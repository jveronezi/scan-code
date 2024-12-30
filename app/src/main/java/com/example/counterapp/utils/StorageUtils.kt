package com.example.counterapp.utils

import android.Manifest
import android.content.Context
import android.os.Build
import android.os.Environment
import androidx.activity.result.ActivityResultLauncher
import org.json.JSONObject
import java.io.File

object StorageUtils {

    /**
     * Request storage permission at runtime
     * @param requestPermissionLauncher ActivityResultLauncher to handle permission requests
     */
    fun requestStoragePermission(requestPermissionLauncher: ActivityResultLauncher<String>) {
        if (Build.VERSION.SDK_INT in Build.VERSION_CODES.M..Build.VERSION_CODES.S) {
            // Request READ_EXTERNAL_STORAGE for API 23 to 32
            requestPermissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
        } else {
            println("Permission not required for this Android version.")
        }
    }

    /**
     * Read a configuration file from the external storage directory
     * @return JSONObject? The parsed JSON object or null if the file doesn't exist
     */
    fun readConfigFromExternalStorage(): JSONObject? {
        // We're searching the file in the Downloads dir
        val externalStorage =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
        val configFile = File(externalStorage, "config.json")

        // Check if the file exists
        return if (configFile.exists()) {
            try {
                val jsonString = configFile.readText(Charsets.UTF_8)
                JSONObject(jsonString)
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        } else {
            println("Config file not found at: ${configFile.absolutePath}")
            null
        }
    }
}
