package com.example.weebgifs.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.weebgifs.R
import com.example.weebgifs.databinding.ActivityMainBinding
import com.example.weebgifs.viewmodel.GIfViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<GIfViewModel>()
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}