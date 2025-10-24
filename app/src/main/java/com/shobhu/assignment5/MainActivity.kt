package com.shobhu.assignment5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var rootLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rootLayout = findViewById(R.id.rootLayout)

        // Attach toolbar so menu shows up
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.color_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.red -> rootLayout.setBackgroundColor(Color.parseColor("#FF0000"))
            R.id.green -> rootLayout.setBackgroundColor(Color.parseColor("#00FF00"))
            R.id.blue -> rootLayout.setBackgroundColor(Color.parseColor("#0000FF"))
            R.id.white -> rootLayout.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        return super.onOptionsItemSelected(item)
    }
}
