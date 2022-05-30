package com.jakmos.dialoginjection

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jakmos.dialoginjection.databinding.FragmentFirstBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.logging.*
import javax.inject.Inject

@AndroidEntryPoint
class FirstFragment : Fragment() {

    @Inject
    lateinit var presenterFactory: DialogPresenterFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentFirstBinding.inflate(inflater, container, false).root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenterFactory.createPresenter(requireContext()).show()
    }
}
