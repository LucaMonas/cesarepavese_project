package com.example.uisettingsfragment

import Fragment.SettingsFragment
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.primaryContainer)))
        supportActionBar?.setDisplayShowTitleEnabled(false)


        openFragment(SettingsFragment())

    }

    fun openFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.FragmentContainer, fragment)
            .commit()
    }
}