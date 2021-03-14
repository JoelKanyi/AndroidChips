package com.kanyideveloper.androidchips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.kanyideveloper.androidchips.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chipGroup.setOnCheckedChangeListener { chipGroup, i ->
            getSelectedText(chipGroup, i)
            Toast.makeText(this,getSelectedText(chipGroup, i), Toast.LENGTH_SHORT ).show()
        }


    }
    private fun getSelectedText(chipGroup: ChipGroup, id: Int): String {
        val mySelection = chipGroup.findViewById<Chip>(id)
        return mySelection?.text?.toString() ?: ""
    }
}