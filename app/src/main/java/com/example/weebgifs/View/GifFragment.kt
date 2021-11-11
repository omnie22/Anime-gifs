package com.example.weebgifs.View

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.navArgs
import com.example.weebgifs.adapter.GifAdapter
import com.example.weebgifs.databinding.FragmentItemImageBinding

/**
 * A fragment representing a list of Items.
 */
class GifFragment : Fragment() {
    private var _binding: FragmentItemImageBinding? = null
    private val binding get() = _binding!!
    private val gifAdapter by lazy { GifAdapter() }

    private val args by navArgs<GifFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentItemImageBinding.inflate(
        inflater, container, false
    ).also { _binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("test", args.gifList.toString())
        gifAdapter.updateGifs(args.gifList)
        binding.list.adapter = gifAdapter
        binding.XView.setOnClickListener{
//            activity?.onBackPressed()
//            childFragmentManager.beginTransaction().remove(this).commit()
//            activity?.supportFragmentManager?.popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}