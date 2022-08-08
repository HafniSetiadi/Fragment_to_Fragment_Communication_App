package com.setiadi.fragmenttofragmentcommunicationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.setiadi.fragmenttofragmentcommunicationapp.fragment.FragmentA
import com.setiadi.fragmenttofragmentcommunicationapp.fragment.FragmentB

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA = FragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentA).commit()
    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = FragmentB()
        fragmentB.arguments = bundle

        transaction.replace(R.id.fragment_container,fragmentB)
        transaction.commit()
    }
}