package com.maverick.cryptocurrencyapp.presentation.coin_detail

import com.maverick.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = "",
)