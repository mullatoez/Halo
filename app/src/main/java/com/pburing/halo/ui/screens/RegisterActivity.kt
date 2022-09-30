package com.pburing.halo.ui.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pburing.halo.R
import com.pburing.halo.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}