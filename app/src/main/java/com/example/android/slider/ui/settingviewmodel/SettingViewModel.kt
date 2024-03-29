package com.example.android.slider.ui.settingviewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.android.slider.datalayer.Repo.SettingRepo

import com.example.android.slider.datalayer.usecases.SettingsUseCase

class SettingViewModel:ViewModel(){
    var settingReporository: SettingRepo = SettingRepo()
    var settingsResponse: MutableLiveData<List<SettingsUseCase>>?=null
    var errormessage: MutableLiveData<String>?= null
    init {
        settingsResponse  = MutableLiveData()
        errormessage=MutableLiveData()
    }
    fun getSettings(){
        settingReporository.getSettings(settingsResponse,errormessage)
    }

}