package io.github.manuelernesto.meukumbu.ui.home

import android.os.Build
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.manuelernesto.meukumbu.R
import io.github.manuelernesto.meukumbu.data.Historic
import io.github.manuelernesto.meukumbu.util.RecyclerViewClickListener
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment(), RecyclerViewClickListener {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    val h1 = Historic(
        "Mercado 3.0",
        "E-Commerce",
        "10.000,00 KZ",
        R.drawable.mercado,
        false
    )

    val h2 = Historic(
        "Socia",
        "E-Commerce",
        "5.000,00 KZ",
        R.drawable.socia,
        false
    )

    val h3 = Historic(
        "Garçom",
        "E-Commerce",
        "8.500,00 KZ",
        R.drawable.garcom,
        false
    )

    val h4 = Historic(
        "Kubinga",
        "Mobility",
        "3.500,00 KZ",
        R.drawable.kubinga,
        false
    )

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        val historics = arrayListOf(h1, h2, h3, h4)

        recycler_view.also {
            it.layoutManager = LinearLayoutManager(requireContext())
            it.setHasFixedSize(true)
            it.adapter = HistoricAdapter(
                historics,
                this
            )
        }
    }

    override fun onRecyclerViewItemClick(view: View, model: Any) {

    }

}