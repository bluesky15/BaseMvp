package com.lkb.basemvp

import androidx.annotation.StringRes

interface View {
    fun showLoadingDialog(active: Boolean)
    fun onError(msg: String)
    fun showToast(@StringRes res: Int)
}