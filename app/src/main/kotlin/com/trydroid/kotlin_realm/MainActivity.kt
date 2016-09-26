package com.trydroid.kotlin_realm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlin_realm.R
import kotlinx.android.synthetic.main.activity_main.textviewHello

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textviewHello.text = "Hello World"
    }
}
