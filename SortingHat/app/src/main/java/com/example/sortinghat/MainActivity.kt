package com.example.sortinghat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home_button_put_hat.typeface = ResourcesCompat.getFont(this, R.font.harry_font)

        val houses = arrayOf(R.drawable.gryffindor, R.drawable.slytherin, R.drawable.ravenclaw, R.drawable.hufflepuff)
        val random = Random.Default
        var index = 0


        home_button_put_hat.setOnClickListener{
                index = random.nextInt(4)
                home_image_selected_house.setImageResource(houses[index])
        }
    }
}