package com.example.uisettingsfragment

import Fragment.SettingsFragment
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MenuItem
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                // Azioni da eseguire quando il pulsante "Indietro" viene premuto
                onBackPressed()
                return true
            }
            // Aggiungi altri casi dell'item se necessario

            else -> return super.onOptionsItemSelected(item)
        }
    }

    fun openFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.FragmentContainer, fragment)
            .commit()
    }
}