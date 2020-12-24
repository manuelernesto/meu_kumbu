package io.github.manuelernesto.meukumbu.ui.cardInfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import io.github.manuelernesto.meukumbu.R
import kotlinx.android.synthetic.main.card_info_fragment.*

class CardInfoFragment : Fragment() {


    private lateinit var viewModel: CardInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.card_info_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(CardInfoViewModel::class.java)


        mk_btn_other.setOnClickListener {
            val action = CardInfoFragmentDirections.toPaymentFragment()
            Navigation.findNavController(it).navigate(action)
        }

        mk_btn_electric.setOnClickListener {
            val action = CardInfoFragmentDirections.toSendFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }



}