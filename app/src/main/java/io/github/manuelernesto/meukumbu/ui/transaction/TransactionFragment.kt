package io.github.manuelernesto.meukumbu.ui.transaction

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.manuelernesto.meukumbu.R
import io.github.manuelernesto.meukumbu.ui.home.TransactionAdapter
import io.github.manuelernesto.meukumbu.util.RecyclerViewClickListener
import io.github.manuelernesto.meukumbu.util.getTransactions
import kotlinx.android.synthetic.main.home_fragment.*
import kotlinx.android.synthetic.main.transaction_fragment.*

class TransactionFragment : Fragment(), RecyclerViewClickListener {

    private lateinit var viewModel: TransactionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.transaction_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TransactionViewModel::class.java)
        mk_recyclerView_transaction.also {
            it.layoutManager = LinearLayoutManager(requireContext())
            it.setHasFixedSize(true)
            it.adapter = TransactionAdapter(
                getTransactions(),
                this
            )
        }
    }

    override fun onRecyclerViewItemClick(view: View, model: Any) {
        TODO("Not yet implemented")
    }

}