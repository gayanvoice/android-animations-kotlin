package render.animations

import android.animation.AnimatorSet
import android.content.Context
import android.view.animation.AccelerateInterpolator

// Java version https://github.com/gayankuruppu/android-view-animations-java/blob/master/androidrenderanimations/src/main/java/render/animations/Render.java
class Render (var cx: Context){
    var du: Long = 1000

    lateinit var animatorSet: AnimatorSet

    fun setAnimation (animatorSet: AnimatorSet){
        this.animatorSet = animatorSet
    }

    fun setDuration (duration: Long){
        this.du = duration
    }

    fun start(){
        animatorSet.setDuration(du)
        animatorSet.setInterpolator (AccelerateInterpolator())
        animatorSet.start()
    }









}