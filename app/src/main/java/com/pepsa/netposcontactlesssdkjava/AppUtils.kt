package com.pepsa.netposcontactlesssdkjava

import com.danbamitale.epmslib.entities.KeyHolder
import com.google.gson.Gson
import com.netpluspay.nibssclient.models.UserData
import com.pixplicity.easyprefs.library.Prefs

object AppUtils {
    const val KEY_HOLDER = "KEY_HOLDER"
    const val CONFIG_DATA = "CONFIG_DATA"
    const val ERROR_TAG = "ERROR_TAG===>"
    const val TAG_MAKE_PAYMENT = "TAG_MAKE_PAYMENT"
    const val TAG_CHECK_BALANCE = "TAG_CHECK_BALANCE"
    const val PAYMENT_SUCCESS_DATA_TAG = "PAYMENT_SUCCESS_DATA_TAG"
    const val PAYMENT_ERROR_DATA_TAG = "PAYMENT_ERROR_DATA_TAG"
    const val TAG_TERMINAL_CONFIGURATION = "TAG_TERMINAL_CONFIGURATION"
    const val CARD_HOLDER_NAME = "CUSTOMER"
    const val POS_ENTRY_MODE = "051"

    fun getSampleUserData() = UserData(
        businessName = "Netplus",
        partnerName = "Netplus",
        partnerId = "5de231d9-1be0-4c31-8658-6e15892f2b83",
        terminalId = "2033ALZP",
        terminalSerialNumber = "0123456789ABC", // getDeviceSerialNumber(),
        businessAddress = "Marwa Lagos",
        customerName = "Test Account",
        "",
        "",
        ""
    )

    fun getSavedKeyHolder(): KeyHolder? {
        val savedKeyHolderInStringFormat = Prefs.getString(KEY_HOLDER)
        return Gson().fromJson(savedKeyHolderInStringFormat, KeyHolder::class.java)
    }
}
