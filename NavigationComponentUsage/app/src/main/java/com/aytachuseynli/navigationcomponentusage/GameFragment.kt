package com.aytachuseynli.navigationcomponentusage

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.aytachuseynli.navigationcomponentusage.databinding.FragmentGameBinding
import com.aytachuseynli.navigationcomponentusage.databinding.FragmentMainBinding


class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
       override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
           binding = FragmentGameBinding.inflate(inflater, container, false)

           val bundle: GameFragmentArgs by navArgs()
           val resultName = bundle.name
           val resultAge  = bundle.age

           Log.e("Result Name",resultName)
           Log.e("Result Age",resultAge.toString())

           val resultPerson = bundle.person

           Log.e("Result Person Name",resultPerson.name)
           Log.e("Result Person Age",resultPerson.age.toString())

           binding.btnFinish.setOnClickListener {
               Navigation.findNavController(it).navigate(R.id.toResult)
           }
           return binding.root

       }


}