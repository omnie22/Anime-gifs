package com.example.weebgifs.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.weebgifs.databinding.ActivityBigGifBinding
import com.example.weebgifs.extensions.loadUrl

class BigGifActivity : AppCompatActivity() {
    private val binding by lazy {ActivityBigGifBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val gif = intent.getStringExtra("url")
        if (gif != null) {
            Log.d("ye", gif)
            binding.beegImage.loadUrl(gif)
        }
        binding.XView.setOnClickListener{
            finish()
        }
    }
}