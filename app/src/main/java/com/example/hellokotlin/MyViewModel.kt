package com.example.hellokotlin

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var aTeamScore: MutableLiveData<Int> = MutableLiveData<Int>()
    var bTeamScore: MutableLiveData<Int> = MutableLiveData<Int>()
    private var aBack: Int = 0
    private var bBack: Int = 0

    init {
        Log.d("songshidian-log", "init, aTeamScore=$aTeamScore")
        aTeamScore.value = 10
        bTeamScore.value = 10
    }

//    public fun aScore() : Int? {
//        Log.d("songshidian-log", "aScore")
//        return aTeamScore.value
//    }
//
//    public fun bScore() : Int? {
//        Log.d("songshidian-log", "bScore")
//        return bTeamScore.value
//    }

    public fun aTeamAdd(p: Int) {
        aBack = aTeamScore.value!!
        bBack = bTeamScore.value!!
        Log.d("songshidian-log", "aTeamAdd:p=$p")
        aTeamScore.value = aTeamScore.value?.plus(p)
        Log.d("songshidian-log", "aTeamAdd:ascore=${aTeamScore.value}")
    }

    public fun bTeamAdd(p: Int) {
        aBack = aTeamScore.value!!
        bBack = bTeamScore.value!!
        Log.d("songshidian-log", "bTeamAdd:p=$p")
        bTeamScore.value = bTeamScore.value?.plus(p)
        Log.d("songshidian-log", "bTeamAdd:ascore=${bTeamScore.value}")
    }

    public fun reset() {
        aBack = aTeamScore.value!!
        bBack = bTeamScore.value!!
        aTeamScore.value = 0
        bTeamScore.value = 0
    }
    public fun undo() {
        aTeamScore.value = aBack
        bTeamScore.value = bBack
    }
}