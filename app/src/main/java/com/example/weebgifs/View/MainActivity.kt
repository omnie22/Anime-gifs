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
        binding.biteBtn.setOnClickListener{
            viewModel.getBite()
        }
        binding.bakaBtn.setOnClickListener{
            viewModel.getBaka()
        }
        binding.blushBtn.setOnClickListener{
            viewModel.getBlush()
        }
        binding.boredBtn.setOnClickListener{
            viewModel.getBored()
        }
        binding.cryBtn.setOnClickListener{
            viewModel.getCry()
        }
        binding.cuddleBtn.setOnClickListener{
            viewModel.getCuddle()
        }
        binding.danceBtn.setOnClickListener{
            viewModel.getDance()
        }
        binding.facepalmBtn.setOnClickListener{
            viewModel.getFacepalm()
        }
        binding.feedBtn.setOnClickListener{
            viewModel.getFeed()
        }
        binding.happyBtn.setOnClickListener{
            viewModel.getHappy()
        }
        binding.highfiveBtn.setOnClickListener{
            viewModel.getHighfive()
        }
        binding.hugBtn.setOnClickListener{
            viewModel.getHug()
        }
        binding.kissBtn.setOnClickListener{
            viewModel.getKiss()
        }
        binding.laughBtn.setOnClickListener{
            viewModel.getLaugh()
        }
        binding.patBtn.setOnClickListener{
            viewModel.getPat()
        }
        binding.pokeBtn.setOnClickListener{
            viewModel.getPoke()
        }
        binding.poutBtn.setOnClickListener{
            viewModel.getPout()
        }
        binding.shrugBtn.setOnClickListener{
            viewModel.getShrug()
        }
        binding.slapBtn.setOnClickListener{
            viewModel.getSlap()
        }
        binding.sleepBtn.setOnClickListener{
            viewModel.getSleep()
        }
        binding.smileBtn.setOnClickListener{
            viewModel.getSmile()
        }
        binding.smugBtn.setOnClickListener{
            viewModel.getSmug()
        }
        binding.stareBtn.setOnClickListener{
            viewModel.getStare()
        }
        binding.thinkBtn.setOnClickListener{
            viewModel.getThink()
        }
        binding.thumbsupBtn.setOnClickListener{
            viewModel.getThumbsup()
        }
        binding.tickleBtn.setOnClickListener{
            viewModel.getTickle()
        }
        binding.waveBtn.setOnClickListener{
            viewModel.getWave()
        }
        binding.winkBtn.setOnClickListener{
            viewModel.getWink()
        }
        viewModel.gifs.observe(this){
            val toGifList = Intent(this, AnnieGifListActivity::class.java)
            toGifList.putExtra("gifList", viewModel.gifs.value)
            startActivity(toGifList)
        }
    }
}