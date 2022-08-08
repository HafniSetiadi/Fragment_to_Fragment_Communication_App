package com.setiadi.fragmenttofragmentcommunicationapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.setiadi.fragmenttofragmentcommunicationapp.Communicator
import com.setiadi.fragmenttofragmentcommunicationapp.R


class FragmentA : Fragment() {
    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        communicator = activity as Communicator

        // mulai dari siini sendBtn bermasalah (merah),
        // "unresolved reference" perlu di deklarasi ?? gimana caranya?.
        view sendBtn.setOnClicklistener {
            communicator.passDataCom(view.messageInput.text.toString())

            return view
        }
    }
}