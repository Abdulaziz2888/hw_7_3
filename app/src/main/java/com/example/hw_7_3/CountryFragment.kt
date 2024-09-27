package com.example.hw_7_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_7_3.databinding.FragmentCountryBinding

class CountryFragment : Fragment() {

    private lateinit var adapter: CountryAdapter
    private val binding by lazy {
        FragmentCountryBinding.inflate(layoutInflater)

    }
    private val listEU = arrayListOf(
        CountryModel("144.2 million","17.1 million km²","Russia","https://i.pinimg.com/736x/1d/91/bb/1d91bb08615863ba06d0ce2ef270ead8.jpg"),
        CountryModel("6.975 million","199,900 km²","Kyrgyzstan","https://i.pinimg.com/736x/65/d1/c1/65d1c1371d3ef4c313b687a16e2e8d7c.jpg"),
        CountryModel("1.412 billion","9.597 million km²","China","https://i.pinimg.com/236x/df/90/e3/df90e392f1e76e8eccfce705d4f0aaee.jpg"),
        CountryModel("38 million","603,628 km²","Ukraine","https://i.pinimg.com/236x/14/50/06/145006d08439a62c780714586fa4b3f4.jpg"),
        CountryModel("9.228 million","207,560 km²","Belarus","https://i.pinimg.com/236x/a4/2f/f7/a42ff7f06292e4e5323f37dccb531ee4.jpg`")
    )
    private val listAF = arrayListOf(
        CountryModel("44.9 million","2.382 million km²","AAlgerian","https://i.pinimg.com/236x/cb/9a/fe/cb9afe27f700851eee960a38f78d5410.jpg"),
        CountryModel("111 million","1.002 million km²","Egypt","https://i.pinimg.com/236x/73/e5/c0/73e5c094e98bc8d99e7d58fc7033c6ae.jpg"),
        CountryModel("37.46 million","446,550 km²","Marroko","https://i.pinimg.com/236x/de/1a/19/de1a192dc570f020a15712a2efa94fb5.jpg"),
        CountryModel("218.5 million","923,768 km²","Niger","https://i.pinimg.com/236x/4a/bc/35/4abc3511312ba0139ba041979d5f8c4d.jpg"),
        CountryModel("17.32 million","196,190 km²","Senegal","https://i.pinimg.com/236x/8a/c5/e5/8ac5e5b9c1c3a70040d73b2fa9e43866.jpg")
    )
    private val listNA = arrayListOf(
        CountryModel("38.93 million","9.985 million km²","Canada","https://i.pinimg.com/236x/14/90/52/14905260c71f7295ef87ce9a425cdde2.jpg"),
        CountryModel("127.5 million","1.973 million km²","Mexico","https://i.pinimg.com/736x/53/ce/ac/53ceac4137f9cdbd7b0d384e6ca62763.jpg"),
        CountryModel("333.3 million","9.834 million km²","USA","https://i.pinimg.com/236x/82/4c/bb/824cbb1495c3bb527109feb69700ec03.jpg"),
        CountryModel("11.21 million","109,884 km²","Cuba","https://i.pinimg.com/236x/8c/39/b5/8c39b56971fd15feaa95667c2f0536e9.jpg"),
        CountryModel("5.181 million","51,100 km²","Costa Rica","https://i.pinimg.com/236x/2e/81/23/2e8123204ebac307d254c12e7e14c69f.jpg")
    )
    private val listSA = arrayListOf(
        CountryModel("46.23 million","2.78 million km²","Argentina","https://i.pinimg.com/236x/ed/53/0c/ed530c3a478f5389b009e91446f89dca.jpg"),
        CountryModel("215.3 million","8.51 million km²","Brazil","https://i.pinimg.com/736x/1c/d4/c7/1cd4c78bd9486690e38f7b589ee7870b.jpg"),
        CountryModel("3.423 million","176,215 km²","Uruguay","https://i.pinimg.com/236x/47/ec/ac/47ecac1fc0348a1c2f141e6815a62e8e.jpg"),
        CountryModel("34.05 million","1.285 million km²","Peru","https://i.pinimg.com/236x/3a/d3/30/3ad33024ebf4ef3f489b098440d3bec2.jpg"),
        CountryModel("19.6 million","756,626 km²","Chili","https://i.pinimg.com/564x/38/24/42/3824428ebcce058ebdde21974ff35532.jpg")
    )



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = activity?.intent?.getStringExtra("key") as ContinentModel
        if (data.title == "SA") {
            addData2()
        } else if (data.title == "NA") {
            addData1()
        } else if (data.title == "AF") {
            addData3()
        } else {
            addData4()
        }

    }
    private fun addData1() {
        adapter = CountryAdapter(listNA)
        binding.rvCountry.adapter = adapter
    }
    private fun addData2() {
        adapter = CountryAdapter(listSA)
        binding.rvCountry.adapter = adapter
    }
    private fun addData3() {
        adapter = CountryAdapter(listAF)
        binding.rvCountry.adapter = adapter
    }
    private fun addData4() {
        adapter = CountryAdapter(listEU)
        binding.rvCountry.adapter = adapter
    }
}