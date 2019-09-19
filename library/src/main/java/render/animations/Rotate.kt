package render.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth

















class Rotate {
    fun In (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -200f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InDownLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun InDownRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotation", 90f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 0f, 1f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotY", y, y)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun InUpLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val x = view.paddingLeft.toFloat()
        val y = view.height - view.paddingBottom.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,     "rotation", 90f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,     "alpha", 0f, 1f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view,     "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view,     "pivotY", y, y)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun InUpRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,  "rotation", -90f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,  "alpha", 0f, 1f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view,  "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view,  "pivotY", y, y)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    /*
    out
     */

    fun Out (view: View) :AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 200f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun OutDownLeft (view: View) :AnimatorSet {
        val animatorSet = AnimatorSet()
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }


    fun OutDownRight (view: View) :AnimatorSet {
        val animatorSet = AnimatorSet()
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun OutUpLeft (view: View) :AnimatorSet {
        val animatorSet = AnimatorSet()
        val x = (view.paddingLeft).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun OutUpRight (view: View) :AnimatorSet {
        val animatorSet = AnimatorSet()
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val object3 = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4 = ObjectAnimator.ofFloat(view, "pivotY", y, y)

        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

}