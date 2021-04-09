package com.simplemobiletools.camera.viewmodels

import android.app.Activity
import android.app.Application
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class CameraViewModel(application: Application) : AndroidViewModel(application) {
    var lastCapturedImage : MutableLiveData<Drawable>? = null

    fun setLastCapturedImage(activity: Activity, lastImage : Bitmap){
        activity.run { kotlin.run { lastCapturedImage?.value = BitmapDrawable(application.resources,lastImage) } }
    }
}
