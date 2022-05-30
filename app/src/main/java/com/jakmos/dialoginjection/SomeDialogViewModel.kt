package com.jakmos.dialoginjection

import android.util.Log
import javax.inject.Inject

class SomeUseCase @Inject constructor()

class SomeDialogViewModel @Inject constructor(
    private val useCase: SomeUseCase
) {

    init {
        Log.v("KUBA", "INIT USE CASE: $useCase")
    }

    fun print() {
        Log.v("KUBA", "PRINT USE CASE: $useCase")
    }
}
