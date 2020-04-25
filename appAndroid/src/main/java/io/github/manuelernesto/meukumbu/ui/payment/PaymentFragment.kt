package io.github.manuelernesto.meukumbu.ui.payment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.manuelernesto.meukumbu.R
import io.github.manuelernesto.meukumbu.ui.home.TransactionAdapter
import io.github.manuelernesto.meukumbu.util.RecyclerViewClickListener
import io.github.manuelernesto.meukumbu.util.getPayments
import io.github.manuelernesto.meukumbu.util.getTransactions
import kotlinx.android.synthetic.main.payment_fragment.*

class PaymentFragment : Fragment(), RecyclerViewClickListener {

    private lateinit var viewModel: PaymentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.payment_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PaymentViewModel::class.java)
        recycler_view_payment.also {
            it.layoutManager = LinearLayoutManager(requireContext())
            it.setHasFixedSize(true)
            it.adapter = PaymentAdapter(
                getPayments(),
                this
            )
        }

    }

    override fun onRecyclerViewItemClick(view: View, model: Any) {
        TODO("Not yet implemented")
    }

}