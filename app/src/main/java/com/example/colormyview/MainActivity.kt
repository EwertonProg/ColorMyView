package com.example.colormyview

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.colormyview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setOnClickForAll(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.constraintLayout,
            binding.yellowButton,
            binding.greenButton,
            binding.blueButton
        )


    }

    fun setOnClickForAll(vararg views: View) {
        for (view in views) {
            view.setOnClickListener { changeColor(it) }
        }
    }

    private fun changeColor(view: View) {
        when (view) {
            binding.boxOneText -> binding.boxOneText.setBackgroundColor(Color.BLUE)
            binding.boxTwoText -> binding.boxTwoText.setBackgroundColor(Color.GREEN)
            binding.boxThreeText -> binding.boxThreeText.setBackgroundColor(Color.YELLOW)
            binding.boxFourText -> binding.boxFourText.setBackgroundColor(Color.RED)
            binding.boxFiveText -> binding.boxFiveText.setBackgroundColor(Color.CYAN)

            binding.yellowButton -> binding.boxThreeText.setBackgroundResource(R.color.yellow_brazil)
            binding.greenButton -> binding.boxFourText.setBackgroundResource(R.color.green_brazil)
            binding.blueButton -> binding.boxFiveText.setBackgroundResource(R.color.blue_brazil)
            else -> view.setBackgroundColor(Color.GRAY)
        }
    }
}
