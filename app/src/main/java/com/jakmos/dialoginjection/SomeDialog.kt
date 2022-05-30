package com.jakmos.dialoginjection

import android.app.Dialog
import android.content.Context
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import dagger.hilt.EntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

class SomeDialog @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted themeResId: Int
) : Dialog(
    context,
    themeResId
) {

    @Inject
    lateinit var viewModel: SomeDialogViewModel

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        viewModel.print()
    }
}
