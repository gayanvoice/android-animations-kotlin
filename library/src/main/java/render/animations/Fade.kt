package render.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.opengl.ETC1.getWidth
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getHeight







class Fade {
    fun In (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun InLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val width = -view.width.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,   "translationX", width / 4f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val width = view.width.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,   "translationX", width / 4f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InUp (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val height = view.height.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,   "alpha", 0f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,   "translationY", height / 4f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InDown (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val height = -view.height.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,   "alpha", 0f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", height / 4f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    /*
    Out
     */

    fun Out (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun OutLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val width = -view.width.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, width / 4f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val width = view.width.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,   "translationX", width / 4f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutUp (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val height = view.height.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,     "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,   "translationY", 0f, height / 4f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutDown (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val height = -view.height.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,  "translationY", 0f, height / 4f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }



}