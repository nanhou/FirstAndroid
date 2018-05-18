package cn.jinxiit.firstandroid.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cn.jinxiit.firstandroid.R

class KotlinActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val sum = sum(5, 6)

        val sum0 = sum0(4, 4)

        "${sum(3, 4)}"
        
    }

    fun sum0(a: Int, b: Int) = a + b

    fun sum(a: Int, b: Int): Int
    {
        return a + b
    }
}
