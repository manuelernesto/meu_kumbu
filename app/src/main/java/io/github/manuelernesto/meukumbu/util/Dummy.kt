package io.github.manuelernesto.meukumbu.util

import io.github.manuelernesto.meukumbu.R
import io.github.manuelernesto.meukumbu.data.Transaction

fun getTransactions(): ArrayList<Transaction> {

    val h1 = Transaction(
        "Mercado 3.0",
        "E-Commerce",
        "10.000,00 KZ",
        R.drawable.mercado_,
        false
    )

    val h2 = Transaction(
        "Socia",
        "E-Commerce",
        "5.000,00 KZ",
        R.drawable.socia_,
        false
    )

    val h3 = Transaction(
        "Garçom",
        "Entregas",
        "8.500,00 KZ",
        R.drawable.garcom_,
        false
    )

    val h4 = Transaction(
        "Kubinga",
        "Mobilidade",
        "3.500,00 KZ",
        R.drawable.kubinga_,
        false
    )

    return arrayListOf(h1, h2, h3, h4)
}