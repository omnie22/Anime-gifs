package com.example.weebgifs.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.weebgifs.View.BigGifActivity
import com.example.weebgifs.databinding.ItemImageBinding
import com.example.weebgifs.extensions.loadUrl
import model.Gif
import model.GifList

class GifAdapter : RecyclerView.Adapter<GifAdapter.GifViewHolder>(){
    private val gifs = mutableListOf<Gif>()

    class GifViewHolder(
        private val binding: ItemImageBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun loadUrl(gif: Gif) = with(binding){
            gif.url.let { ivImage.loadUrl(it) }
            ivImage.setOnClickListener{
                Log.d("test", gif.url)
                var context = it.getContext()
                var toBigGif = Intent(context, BigGifActivity::class.java)
                toBigGif.putExtra("url", gif.url)
                startActivity(context, toBigGif, null)
            }
        }
        companion object {
            fun getInstance(parent: ViewGroup): GifViewHolder {
                val binding = ItemImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return GifViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifViewHolder {
        return GifViewHolder.getInstance(parent)
    }

    override fun onBindViewHolder(holder: GifViewHolder, position: Int) {
        gifs[position].url?.let { holder.loadUrl(gifs[position]) }
    }

    override fun getItemCount(): Int {
        return gifs.size
    }
    fun updateGifs(gifs: GifList?){
        val size = this.gifs.size
        this.gifs.clear()
        notifyItemRangeRemoved(0, size)
        this.gifs.addAll(gifs?.url ?: listOf())
        if (gifs != null) {
            notifyItemRangeInserted(0, gifs.url.size)
        }
    }
}