package render.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup

class Slide {
    fun InDown (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val distance = (view.top + view.height).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", -distance, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "translationX", -distance, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "translationX", distance, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InUp (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "translationY", distance, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutDown (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "translationY", 0f, distance)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val right = view.right.toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "translationX", 0f, -right)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "translationX", 0f, distance)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutUp (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val bottom = -view.bottom.toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "translationY", 0f, bottom)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }




}