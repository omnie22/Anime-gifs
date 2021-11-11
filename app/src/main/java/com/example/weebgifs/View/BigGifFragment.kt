package com.example.weebgifs.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.weebgifs.R
import com.example.weebgifs.databinding.FragmentBigGif2Binding
import com.example.weebgifs.extensions.loadUrl

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BigGifFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BigGifFragment : Fragment() {
    private val args by navArgs<BigGifFragmentArgs>()
    var _binding: FragmentBigGif2Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentBigGif2Binding.inflate(
        inflater, container, false
    ).also { _binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.beegImage.loadUrl(args.gif)
        binding.XView.setOnClickListener{
            activity?.onBackPressed()
        }
    }
}