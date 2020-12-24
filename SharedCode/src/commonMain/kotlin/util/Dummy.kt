package io.github.manuelernesto.meukumbu.sharedcode.util

import io.github.manuelernesto.meukumbu.sharedcode.data.Transaction


fun getDummyTransactions(imgs: List<Int>): ArrayList<Transaction> {

    val h1 = Transaction(
        "Mercado 3.0",
        "E-Commerce",
        "10.000,00 KZ",
        imgs[0],
        false
    )

    val h2 = Transaction(
        "Socia",
        "E-Commerce",
        "5.000,00 KZ",
        imgs[1],
        false
    )

    val h3 = Transaction(
        "Garçom",
        "Entregas",
        "8.500,00 KZ",
        imgs[2],
        false
    )

    val h4 = Transaction(
        "Kubinga",
        "Mobilidade",
        "3.500,00 KZ",
        imgs[3],
        false
    )

    return arrayListOf(h1, h2, h3, h4)
}
