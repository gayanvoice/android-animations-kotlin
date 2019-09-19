package render.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class Attention {
    fun bounce (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, 0f, -30f, 0f, -15f, 0f, 0f)
        animatorSet.playTogether(object1)
        return animatorSet
    }
}