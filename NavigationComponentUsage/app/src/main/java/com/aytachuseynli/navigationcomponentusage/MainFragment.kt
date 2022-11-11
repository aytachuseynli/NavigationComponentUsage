package com.aytachuseynli.navigationcomponentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aytachuseynli.navigationcomponentusage.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.btnStart.setOnClickListener{
            //Snackbar.make(it,"Hello",Snackbar.LENGTH_SHORT).show()
            val person = Persons("Mehmet",34)

            val navigation = MainFragmentDirections.toGame(name = "Ahmet", age = 23, person = person)
            Navigation.findNavController(it).navigate(navigation)
        }


        return binding.root
    }

}