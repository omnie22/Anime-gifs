package com.example.weebgifs.View

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.weebgifs.R
import com.example.weebgifs.databinding.FragmentButtonListBinding
import com.example.weebgifs.viewmodel.GIfViewModel
import com.example.weebgifs.model.GifList

class ButtonListFragment : Fragment(R.layout.fragment_button_list) {
    private var _binding: FragmentButtonListBinding? = null
    private val binding get() = _binding!!
    private val viewModel by activityViewModels<GIfViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentButtonListBinding.inflate(
        inflater, container, false
    ).also { _binding=it }.root

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
        viewModel.gifs.observe(viewLifecycleOwner){
            Log.d("stuff", it.toString())

            val action = ButtonListFragmentDirections
                .actionButtonListFragmentToGifFragment(it)

            findNavController().navigate(action)

//            val toGifList = Intent(this, AnnieGifListActivity::class.java)
//            toGifList.putExtra("gifList", viewModel.gifs.value)
//            startActivity(toGifList)
        }
    }
}