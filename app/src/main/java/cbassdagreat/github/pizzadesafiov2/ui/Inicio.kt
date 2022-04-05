package cbassdagreat.github.pizzadesafiov2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import cbassdagreat.github.pizzadesafiov2.R
import cbassdagreat.github.pizzadesafiov2.databinding.FragmentInicioBinding
import cbassdagreat.github.pizzadesafiov2.model.Ingredientes
import cbassdagreat.github.pizzadesafiov2.model.Pizza

class Inicio : Fragment() {
    lateinit var binding: FragmentInicioBinding
    var lista: ArrayList<Ingredientes> = ArrayList()
    lateinit var maza: String
    var total = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInicioBinding.inflate(layoutInflater)
        return binding.root

        with(binding)
        {
            btnNext.setOnClickListener {
                val nombre = etNomReg.text.toString()
                maza = spMaza.selectedItem.toString()
                total = generarLista()
                val pizza: Pizza = Pizza(nombre,maza,lista,total)
                val bundle: Bundle = Bundle()
                bundle.putSerializable("pizza",pizza)
                Navigation.findNavController(requireView()).navigate(R.id.action_inicio_to_final1,bundle)
            }
        }
    }

    private fun generarLista(): Int

    {

        with(binding)
        {
            if(switchCarne.isChecked)
            {
                val ingre1 = "Carne"
                val valor1 = 400
                val ingrediente1 = Ingredientes(ingre1,valor1)
                lista.add(ingrediente1)
                total += valor1
            }
            if (switchPepperoni.isChecked)
            {
                val ingre2 = "Pepperoni"
                val valor2 = 200
                val ingrediente2 = Ingredientes(ingre2,valor2)
                lista.add(ingrediente2)
                total += valor2
            }

            if (switchTocino.isChecked)
            {
                val ingre3 = "Tocino"
                val valor3 = 450
                val ingrediente3 = Ingredientes(ingre3,valor3)
                lista.add(ingrediente3)
                total += valor3
            }

            if (switchChampi.isChecked)
            {
                val ingre4 = "Champiñón"
                val valor4 = 250
                val ingrediente4 = Ingredientes(ingre4,valor4)
                lista.add(ingrediente4)
                total += valor4
            }

            if (switchTomate.isChecked)
            {
                val ingre5 = "Tomate"
                val valor5 = 200
                val ingrediente5 = Ingredientes(ingre5,valor5)
                lista.add(ingrediente5)
                total += valor5
            }

            if (switchChoclo.isChecked)
            {
                val ingre6 = "Choclo"
                val valor6 = 200
                val ingrediente6 = Ingredientes(ingre6,valor6)
                lista.add(ingrediente6)
                total += valor6
            }

            if (switchAceituna.isChecked)
            {
                val ingre7 = "Aceituna"
                val valor7 = 250
                val ingrediente7 = Ingredientes(ingre7,valor7)
                lista.add(ingrediente7)
                total += valor7
            }
        }
        return total
    }
}