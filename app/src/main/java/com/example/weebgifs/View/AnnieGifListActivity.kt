package com.example.weebgifs.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import com.example.weebgifs.adapter.GifAdapter
import com.example.weebgifs.databinding.ActivityAnnieGifListBinding
import com.example.weebgifs.model.GifList

class AnnieGifListActivity : AppCompatActivity() {
    private val binding by lazy { ActivityAnnieGifListBinding.inflate(layoutInflater) }
//    private val gifAdapter by lazy { GifAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val gifs = intent.getParcelableExtra<GifList>("gifList")
//            gifAdapter.updateGifs(gifs)
//            binding.rvImages.adapter = gifAdapter
    }
}