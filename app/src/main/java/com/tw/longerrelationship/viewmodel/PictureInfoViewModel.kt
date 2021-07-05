package com.tw.longerrelationship.viewmodel

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PictureInfoViewModel : ViewModel() {

    lateinit var uriList: ArrayList<Uri>

    /**
     * 当前显示的图片
     */
    var currentPicture: MutableLiveData<Int> = MutableLiveData()

}