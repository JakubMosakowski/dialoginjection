package com.jakmos.dialoginjection

import android.content.Context
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Inject

class DialogPresenter @AssistedInject constructor(
    @Assisted private val context: Context,
    private val dialogFactory: DialogFactory
) {

    fun show() = dialogFactory.createDialog(context, 1).show()
}

@AssistedFactory
interface DialogPresenterFactory {

    fun createPresenter(
        context: Context,
    ): DialogPresenter
}

@AssistedFactory
interface DialogFactory {

    fun createDialog(
        context: Context,
        themeResId: Int,
    ): SomeDialog
}
