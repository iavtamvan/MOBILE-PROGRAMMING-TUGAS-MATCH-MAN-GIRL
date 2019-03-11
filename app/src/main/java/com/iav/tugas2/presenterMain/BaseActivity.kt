package com.iav.tugas2.presenterMain

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.hanks.htextview.base.AnimationListener
import com.hanks.htextview.base.HTextView

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {



    class ClickListener : View.OnClickListener {
        internal var sentences = arrayOf(
            "What is design?",
            "Design is not just",
            "what it looks like and feels like.",
            "Design is how it works. \n- Steve Jobs",
            "Older people",
            "sit down and ask,",
            "'What is it?'",
            "but the boy asks,",
            "'What can I do with it?'. \n- Steve Jobs",
            "Swift",
            "Objective-C",
            "iPhone",
            "iPad",
            "Mac Mini",
            "MacBook Pro",
            "Mac Pro",
            "爱老婆",
            "老婆和女儿"
        )
        var index: Int = 0
        override fun onClick(v: View) {
            if (v is HTextView) {
                if (index + 1 >= sentences.size) {
                    index = 0
                }
                v.animateText(sentences[index++])
            }
        }
    }

    class SimpleAnimationListener(private val context: Context) : AnimationListener {
        override fun onAnimationEnd(hTextView: HTextView) {
            Toast.makeText(context, "Animation finished", Toast.LENGTH_SHORT).show()
        }
    }

}