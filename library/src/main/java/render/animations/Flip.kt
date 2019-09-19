package render.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class Flip {
    fun InX (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.5f, 0.75f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotationX", 90f, -15f, 15f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InY (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.5f, 0.75f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,   "rotationY", 90f, -15f, 15f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutX (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,  "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotationX", 0f, 90f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutY (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotationY", 0f, 90f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

}