/*
 * MIT License
 *
 * Copyright (c) 2019 Gayan Kuruppu
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package render.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class Bounce {
    fun In (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,  "scaleX", 0.3f, 1.05f, 0.9f, 1f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 1.05f, 0.9f, 1f)

        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun InLeft (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val width = -view.width.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", width, 30f, -10f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,  "alpha", 0f, 1f, 1f, 1f)


        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InRight (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val width = -view.width.toFloat()
        val measured_width = -view.measuredWidth.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", measured_width + width, -30f, 10f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,  "alpha", 0f, 1f, 1f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InUp (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val measured_height = view.measuredHeight.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,   "translationY", measured_height, -30f, 10f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,  "alpha", 0f, 1f, 1f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun InDown (view: View) :AnimatorSet{
        val animatorSet = AnimatorSet()
        val height = -view.height.toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,  "alpha", 0f, 1f, 1f, 1f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", height, 30f, -10f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }
}