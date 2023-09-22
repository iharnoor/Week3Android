package com.example.week2android

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.week2android.databinding.FirstFragmentBinding

class FirstFragment:Fragment() {

    private lateinit var _binding: FirstFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FirstFragmentBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        _binding.button.setOnClickListener {
            // Way 1 to set Image
//            val newImageDrawable: Drawable? = getDrawable( R.drawable.image1)
            val newImageDrawable: Drawable? = ContextCompat.getDrawable(view.context, R.drawable.image1)
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
