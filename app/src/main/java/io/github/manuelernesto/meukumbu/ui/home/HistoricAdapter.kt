package io.github.manuelernesto.meukumbu.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.github.manuelernesto.meukumbu.R
import io.github.manuelernesto.meukumbu.data.Historic
import io.github.manuelernesto.meukumbu.databinding.MkHistoricItemBinding
import io.github.manuelernesto.meukumbu.util.RecyclerViewClickListener

class HistoricAdapter(
    private val historics: List<Historic>,
    private val listener: RecyclerViewClickListener
) : RecyclerView.Adapter<HistoricAdapter.HistoricViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HistoricViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.mk_historic_item,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: HistoricViewHolder, position: Int) {
        holder.recyclerViewBinding.historic = historics[position]
    }


    override fun getItemCount() = historics.size

    inner class HistoricViewHolder(val recyclerViewBinding: MkHistoricItemBinding) :
        RecyclerView.ViewHolder(recyclerViewBinding.root)
}