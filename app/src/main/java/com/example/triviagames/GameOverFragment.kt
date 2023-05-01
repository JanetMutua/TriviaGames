package com.example.triviagames

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.triviagames.databinding.FragmentGameOverBinding


class GameOverFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentGameOverBinding = FragmentGameOverBinding.inflate(layoutInflater)
        return binding.root
    }

}