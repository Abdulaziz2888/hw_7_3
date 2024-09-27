package com.example.hw_7_3

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw_7_3.databinding.FragmentContinetBinding

class ContinentFragment : Fragment(),OnClick {

    private lateinit var adapter: ContinentAdapter
    private val binding by lazy {
        FragmentContinetBinding.inflate(layoutInflater)
    }
    private val list = arrayListOf(
        ContinentModel("https://i.pinimg.com/564x/77/f4/f2/77f4f2c2fbbd6dce0cfe34bf951ee801.jpg", "AS"),
        ContinentModel("https://i.pinimg.com/564x/ad/a7/02/ada702c26799e66c002ed85ab76fdd0e.jpg", "SA"),
        ContinentModel("https://i.pinimg.com/236x/f5/de/7a/f5de7a28e2a71d0ad7f7c8171fc2ee55.jpg", "AF"),
        ContinentModel("https://i.pinimg.com/236x/c6/ba/5d/c6ba5d5299b693dcde58f527da437d7c.jpg", "EU")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addData()
    }

    private fun addData() {
        adapter = ContinentAdapter(list,this@ContinentFragment)
        binding.rvContinent.adapter = adapter
    }

    override fun onClick(model: ContinentModel) {
        val bundle = Bundle()
        bundle.putSerializable("key", model)
        val intent = Intent(requireContext(), CountryFragment::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

}