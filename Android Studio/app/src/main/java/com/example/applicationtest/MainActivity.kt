package com.example.applicationtest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        to_test1.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, test::class.java)
            startActivity(intent)
            Log.i("Activity 1", "Linear Layout verticale")
        }
        to_test2.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, test2::class.java)
            startActivity(intent)
            Log.i("Activity 2", "Linear Layout horizontale (weight)")
        }
        to_test3.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, test3::class.java)
            startActivity(intent)
            Log.i("Activity 3", "Linear Layout verticale (weight)")
        }
        to_test4.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, test4::class.java)
            startActivity(intent)
            Log.i("Activity 4", "Linear Layout verticale (gravity)")
        }
        to_test5.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, test5::class.java)
            startActivity(intent)
            Log.i("Activity 5", "Table Layout")
        }
        to_test6.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, test6::class.java)
            startActivity(intent)
            Log.i("Activity 6", "Relative Layout")
        }
        to_test7.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, test7::class.java)
            startActivity(intent)
            Log.i("Activity 7", "Grid Layout")
        }
        to_test8.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, test8::class.java)
            startActivity(intent)
            Log.i("Activity 8", "Linear Layout + scrollview")
        }
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
