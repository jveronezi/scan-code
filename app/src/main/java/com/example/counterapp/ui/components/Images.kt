package com.example.counterapp.ui.components
import android.widget.ImageView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.counterapp.R



@Composable
fun CheckMark(modifier: Modifier = Modifier) {
    GlideImage(
        imageRes = R.drawable.check,
        modifier = modifier
    )
}

@Composable
fun XMark(modifier: Modifier = Modifier) {
    GlideImage(
        imageRes = R.drawable.xmark,
        modifier = modifier
    )
}

@Composable
fun Barcode(modifier: Modifier = Modifier) {
    GlideImage(
        imageRes = R.drawable.barcode,
        modifier = modifier
    )
}

@Composable
fun GlideImage(imageRes: Int, modifier: Modifier = Modifier) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            ImageView(context).apply {
                Glide.with(context)
                    .load(imageRes)
                    .apply(RequestOptions().centerInside())
                    .into(this)
            }
        }
    )
}