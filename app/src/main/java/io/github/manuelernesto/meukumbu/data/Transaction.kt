package io.github.manuelernesto.meukumbu.data

data class Transaction(
    val company: String,
    val category: String,
    val value: String,
    val img: Int,
    val isIncome: Boolean
) {
    fun getValues(): String {
        return if (isIncome)
            "+ $value"
        else
            "- $value"
    }
}