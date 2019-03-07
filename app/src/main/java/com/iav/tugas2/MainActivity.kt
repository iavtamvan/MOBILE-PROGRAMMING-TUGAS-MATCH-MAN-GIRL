package com.iav.tugas2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { pasangan() }
    }

    fun pasangan() {
        val randomCewek = Random().nextInt(3)+1
        val randomCowok = Random().nextInt(3)+1
        val drawableResCewek = when(randomCewek) {
            1 -> R.drawable.cewek1
            2 -> R.drawable.cewek2
            else -> R.drawable.cewek3
        }
        val drawableResCowok = when(randomCowok) {
            1 -> R.drawable.cowok3
            2 -> R.drawable.cowok1
            else -> R.drawable.cowok2
        }

        ivDadu1.setImageResource(drawableResCewek)
        ivDadu2.setImageResource(drawableResCowok)


    }


//    fun kocokDadu() {
//        val randomInt = Random().nextInt(3) + 1
//        val randomInt2 = Random().nextInt(3) + 1
//        val drawableRecource = when (randomInt) {
//            1 -> R.drawable.cewek1
//            2 -> R.drawable.cewek2
//            else -> R.drawable.cewek3
//        }
//        val drawableRecource1 = when (randomInt2) {
//            1 -> R.drawable.cowok2
//            2 -> R.drawable.cowok3
//            else -> R.drawable.cowok1
//
//        }
//        ivDadu1.setImageResource(drawableRecource)
//        ivDadu2.setImageResource(drawableRecource1)
//    }
}
