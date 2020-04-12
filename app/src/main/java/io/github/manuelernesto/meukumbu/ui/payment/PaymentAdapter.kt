package io.github.manuelernesto.meukumbu.ui.payment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.github.manuelernesto.meukumbu.R
import io.github.manuelernesto.meukumbu.data.Payment
import io.github.manuelernesto.meukumbu.data.Transaction
import io.github.manuelernesto.meukumbu.databinding.MkPaymentItemBinding
import io.github.manuelernesto.meukumbu.databinding.MkTransactionItemBinding
import io.github.manuelernesto.meukumbu.util.RecyclerViewClickListener

class PaymentAdapter(
    private val payments: List<Payment>,
    private val listener: RecyclerViewClickListener
) : RecyclerView.Adapter<PaymentAdapter.HistoricViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HistoricViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.mk_payment_item,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: HistoricViewHolder, position: Int) {
        holder.recyclerViewBinding.payment = payments[position]
    }


    override fun getItemCount() = payments.size

    inner class HistoricViewHolder(val recyclerViewBinding: MkPaymentItemBinding) :
        RecyclerView.ViewHolder(recyclerViewBinding.root)
}