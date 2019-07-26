package com.stuffshuf.bottommenu

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.nav_view
import kotlinx.android.synthetic.main.activity_main.textView1

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.navigation_home -> {
          supportFragmentManager.beginTransaction().replace(R.id.fragement, BlankFragment()).commit()
          //  textView1.setText(R.string.title_home)
            true
        }
        R.id.navigation_dashboard -> {
            supportFragmentManager.beginTransaction().replace(R.id.container,BlankFragment2()).commit()
           // textView1.setText(R.string.title_dashboard)
            true
        }
        R.id.navigation_notifications -> {

            //textView1.setText(R.string.title_notifications)
            true
        }
        else -> false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_view.setOnNavigationItemSelectedListener(this)
    }
}