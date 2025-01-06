# Android Scanner APP

A native Android application designed for seamless QR code scanning at event entrances. It verifies the validity of QR codes and is fully functional even without an internet connection, ensuring reliability in offline environments.


## Project Documentation



## UI Layer
- Built using **Jetpack Compose**.
- Supports Material Design 3 components and state-based rendering.
- **Dependencies:**
  - `androidx.compose.material3`
  - `androidx.compose.ui`
  - `androidx.compose.ui.graphics`
  - `androidx.compose.ui.tooling`
  - `androidx.activity.compose`
  - `androidx.runtime.livedata`

---

## Data Layer
- Handles data retrieval and state management.
- Integrated navigation for Compose screens.
- **Dependencies:**
  - `androidx.lifecycle.runtime.ktx`
  - `androidx.navigation.compose`
  - `zxing-android-embedded` (QR code scanning)

---

## Dependency Injection
- Powered by **HILT** for streamlined dependency management.
- **Dependencies:**
  - `hilt-android`
  - `hilt-android-compiler`
  - `hilt-navigation-compose`

---

## Camera Integration
- Implements **CameraX** for camera operations.
- **Dependencies:**
  - `androidx.camera.core`
  - `androidx.camera.camera2`
  - `androidx.camera.lifecycle`
  - `androidx.camera.view`

---

## Testing
- Supports unit and UI testing.
- **Dependencies:**
  - `junit`
  - `androidx.test.espresso.core`
  - `androidx.ui.test.junit4`
  - `androidx.ui.test.manifest`

---

## Build Configuration
- **Compile SDK Version:** 35
- **Min SDK Version:** 21
- **Target SDK Version:** 35
- **Java Compatibility:** 11
- **Kotlin JVM Target:** 11

---

## Plugins
- `com.android.application`
- `org.jetbrains.kotlin.android`
- `org.jetbrains.kotlin.plugin.compose`
- `com.google.dagger.hilt.android`

