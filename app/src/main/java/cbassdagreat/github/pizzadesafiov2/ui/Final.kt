package cbassdagreat.github.pizzadesafiov2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cbassdagreat.github.pizzadesafiov2.R
import cbassdagreat.github.pizzadesafiov2.databinding.FragmentFinalBinding
import cbassdagreat.github.pizzadesafiov2.model.Ingredientes

class Final : Fragment() {

    lateinit var binding: FragmentFinalBinding
    val lista: ArrayList<Ingredientes> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFinalBinding.inflate(layoutInflater)

        return binding.root
    }
}