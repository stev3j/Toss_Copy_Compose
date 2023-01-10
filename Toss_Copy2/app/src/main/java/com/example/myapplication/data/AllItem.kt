package com.example.myapplication.data

import com.example.myapplication.R

data class AllItem (
    val icon: Int,
    val name: String,
)

object DataProvider {
    val AllList = listOf(
        AllItem(R.drawable.ic_remit_blue, "송금"),
        AllItem(R.drawable.ic_horizon_card, "내 자산"),
        AllItem(R.drawable.ic_vertical_card, "토스유스카드"),
    )
}