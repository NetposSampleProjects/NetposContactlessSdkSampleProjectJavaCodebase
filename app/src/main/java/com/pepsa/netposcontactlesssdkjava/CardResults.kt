package com.pepsa.netposcontactlesssdkjava

import com.netpluspay.contactless.sdk.card.CardReadResult

data class CardResults(
    val cardReadResult: CardReadResult,
    val cardScheme: String
)
