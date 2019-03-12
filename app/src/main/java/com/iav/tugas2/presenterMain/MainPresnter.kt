package com.iav.tugas2.presenterMain

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.iav.tugas2.R
import java.util.*

class MainPresnter {
    fun pasangan(ivCewek:ImageView, ivCowok:ImageView, context:Context ) {
        val randomCewek = Random().nextInt(6) + 1
        val randomCowok = Random().nextInt(13) + 1
        val drawableResCewek = when (randomCewek) {
            1 -> R.drawable.ayulest
            2 -> R.drawable.fuji
            3 -> R.drawable.hanum
            4 -> R.drawable.faliz
            5 -> R.drawable.mela
            else -> R.drawable.umikhotimatuss

        }
        val drawableResCowok = when (randomCowok) {
            1 -> R.drawable.falih
            2 -> R.drawable.iav
            3 -> R.drawable.harris
            4 -> R.drawable.kiki
            5 -> R.drawable.riki
            6 -> R.drawable.deni
            7 -> R.drawable.edi
            8 -> R.drawable.eggy
            9 -> R.drawable.filipus_neri
            10 -> R.drawable.gambar_1
            11 -> R.drawable.huda_mobile
            12 -> R.drawable.odiba
            else -> R.drawable.yusron_afanji
        }
        Glide.with(context)
            .load(drawableResCewek)
            .override(512, 512)
            .centerCrop()
            .placeholder(R.drawable.dice_1)
            .into(ivCewek)
        Glide.with(context)
            .load(drawableResCowok)
            .override(512, 512)
            .centerCrop()
            .placeholder(R.drawable.dice_1)
            .into(ivCowok)
    }
}