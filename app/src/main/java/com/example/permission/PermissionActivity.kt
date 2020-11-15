package com.example.permission

import android.content.Context
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class PermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)


        val cameraPermissionCheck = ContextCompat.checkSelfPermission(
            this@PermissionActivity,
            android.Manifest.permission.CAMERA // 카메라 권한 넣어줌
        )

        if (cameraPermissionCheck != PackageManager.PERMISSION_GRANTED) {       //권한이 없는 경우

        } else {
            //권한이 있는 경우
        }
    }
}