package com.iav.tugas2.presenterMain

import android.widget.ImageView
import com.iav.tugas2.R
import java.util.*

class MainPresnter {
    fun pasangan(ivCewek:ImageView, ivCowok:ImageView ) {
        val randomCewek = Random().nextInt(3) + 1
        val randomCowok = Random().nextInt(3) + 1
        val drawableResCewek = when (randomCewek) {
            1 -> R.drawable.cewek1
            2 -> R.drawable.cewek2
            else -> R.drawable.cewek3
        }
        val drawableResCowok = when (randomCowok) {
            1 -> R.drawable.cowok3
            2 -> R.drawable.cowok1
            else -> R.drawable.cowok2
        }
        ivCewek.setImageResource(drawableResCewek)
        ivCowok.setImageResource(drawableResCowok)


    }
}