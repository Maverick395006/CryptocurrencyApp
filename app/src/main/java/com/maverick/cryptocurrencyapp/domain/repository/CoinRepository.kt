package com.maverick.cryptocurrencyapp.domain.repository

import com.maverick.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.maverick.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}