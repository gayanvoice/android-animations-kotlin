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