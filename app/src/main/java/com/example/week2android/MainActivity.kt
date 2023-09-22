package com.example.week2android

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.week2android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)


        _binding.button.setOnClickListener {
            // Way 1 to set Image
//            val newImageDrawable: Drawable? = getDrawable( R.drawable.image1)
            val newImageDrawable: Drawable? = ContextCompat.getDrawable(this, R.drawable.image1)
            _binding.imageView.setImageDrawable(newImageDrawable)

            setImageUsingGlide()
        }
    }

    private fun setImageUsingGlide() {
        Glide
            .with(this)
            .load("https://image.tmdb.org/t/p/original/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg")
            .centerCrop()
            .into(_binding.imageView);
    }
}