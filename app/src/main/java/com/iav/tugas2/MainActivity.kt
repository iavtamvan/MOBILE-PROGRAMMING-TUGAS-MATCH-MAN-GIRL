package com.iav.tugas2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.iav.tugas2.presenterMain.MainPresnter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mainPresnter: MainPresnter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresnter = MainPresnter()
        btnMatch.setOnClickListener { mainPresnter.pasangan(ivCewek, ivCowok) }
    }
}