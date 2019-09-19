package render.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup

class Zoom {
    fun In (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1 = ObjectAnimator.ofFloat(view, "scaleX", 0.45f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleY", 0.45f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun InDown (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val bottom = -view.bottom.toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.475f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.475f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "translationY", bottom, 60f, 0f)
        val object4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun InLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val right = -view.right.toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.475f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.475f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "translationX", right, 48f, 0f)
        val object4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun InRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val width = -view.width.toFloat()
        val right = -view.paddingRight.toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.475f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.475f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "translationX", width + right, -48f, 0f)
        val object4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun InUp (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.475f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.475f, 1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationY", distance, -60f, 0f)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    /*
    Out
     */

    fun Out (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.3f, 0f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.3f, 0f)

        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun OutDown (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.475f, 0.1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.475f, 0.1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationY", 0f, -60f, distance)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }



    fun OutLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val right = -view.right.toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.475f, 0.1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.475f, 0.1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationX", 0f, 42f, right)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun OutRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val parent = view.parent as ViewGroup
        val distance = (parent.width - parent.left).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.475f, 0.1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.475f, 0.1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationX", 0f, -42f, distance)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun OutUp (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val bottom = -view.bottom.toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.475f, 0.1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.475f, 0.1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationY", 0f, 60f, bottom)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }




}