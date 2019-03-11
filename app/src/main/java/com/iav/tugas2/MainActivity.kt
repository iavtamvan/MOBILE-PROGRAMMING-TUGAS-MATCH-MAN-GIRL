package com.iav.tugas2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hanks.htextview.base.AnimationListener
import com.iav.tugas2.presenterMain.BaseActivity
import com.iav.tugas2.presenterMain.MainPresnter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    private lateinit var mainPresnter: MainPresnter
    private lateinit var simple: AnimationListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAppsPasangan.setOnClickListener(BaseActivity.ClickListener())
        tvAppsPasangan.setAnimationListener(BaseActivity.SimpleAnimationListener(this))
        mainPresnter = MainPresnter()
        btnMatch.setOnClickListener { mainPresnter.pasangan(ivCewek, ivCowok) }
    }
}