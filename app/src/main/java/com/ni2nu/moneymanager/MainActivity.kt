package com.ni2nu.moneymanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ni2nu.moneymanager.activity.AddActivity
import com.ni2nu.moneymanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.fabBtn.setOnClickListener {
            val i = Intent(this, AddActivity::class.java)
            startActivity(i)
        }
    }
}