package io.github.manuelernesto.meukumbu.sharedcode.util
import io.github.manuelernesto.meukumbu.sharedcode.data.Transaction


expect fun getIcons(): List<Int>

fun getTransactions(): ArrayList<Transaction> {

    val h1 = Transaction(
        "Mercado 3.0",
        "E-Commerce",
        "10.000,00 KZ",
        getIcons()[0],
        false
    )

    val h2 = Transaction(
        "Socia",
        "E-Commerce",
        "5.000,00 KZ",
        getIcons()[0],
        false
    )

    val h3 = Transaction(
        "Garçom",
        "Entregas",
        "8.500,00 KZ",
        getIcons()[0],
        false
    )

    val h4 = Transaction(
        "Kubinga",
        "Mobilidade",
        "3.500,00 KZ",
        getIcons()[0],
        false
    )

    return arrayListOf(h1, h2, h3, h4)
}
