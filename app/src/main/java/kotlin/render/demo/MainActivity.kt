package kotlin.render.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import render.animations.Render

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val render = Render()
        render.Start()



    }
}
