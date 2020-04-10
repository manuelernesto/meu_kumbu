package io.github.manuelernesto.meukumbu.util

import android.view.View

interface RecyclerViewClickListener {

    fun onRecyclerViewItemClick(view: View, model: Any)
}