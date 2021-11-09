package com.example.weebgifs.View

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.example.weebgifs.adapter.GifAdapter
import com.example.weebgifs.databinding.ActivityAnnieGifListBinding
import model.GifList

class AnnieGifListActivity : AppCompatActivity() {
    //    private val ViewModel by viewModels<GifViewModel>()
    private val binding by lazy { ActivityAnnieGifListBinding.inflate(layoutInflater) }
    private val gifAdapter by lazy { GifAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val gifs = intent.getParcelableExtra<GifList>("gifList")
            gifAdapter.updateGifs(gifs)
            binding.rvImages.adapter = gifAdapter
    }
}