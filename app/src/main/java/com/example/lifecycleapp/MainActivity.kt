package com.example.lifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart Method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart Method")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onStop Method")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop Method")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume Method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy Method")
    }
}